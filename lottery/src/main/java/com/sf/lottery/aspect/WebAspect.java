package com.sf.lottery.aspect;

import com.sf.lottery.exception.LotteryException;
import com.sf.lottery.utils.JsonResult;
import com.sf.lottery.utils.ResultCode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.lang.reflect.Method;
import java.util.List;

@Aspect
@Component
@Order(-99)
public class WebAspect {
    private static final Logger logger = LoggerFactory.getLogger(WebAspect.class);

    public WebAspect() {
        logger.info("初始化WebAspect");
    }

    /**
     * 拦截器具体实现
     *
     * @param pjp
     * @return JsonResult（被拦截方法的执行结果，或需要登录的错误提示。）
     */
    @Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public Object Interceptor(ProceedingJoinPoint pjp) {
        // 获取方法签名
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        // 获取被拦截的方法
        Method method = signature.getMethod();
        // 获取被拦截的方法名
        String methodName = method.getName();
        // 获取类名
        String className = pjp.getTarget().getClass().getSimpleName();

        Object result = null;


        // 校验参数
        for(Object obj : pjp.getArgs()) {
            // 判断是否绑定验证
            if(obj instanceof BindingResult) {
                BindingResult br = (BindingResult) obj;
                //绑定验证消息不为空==>有错误
                if(br.hasErrors()) {
                    List<ObjectError> list = br.getAllErrors();
                    result = new JsonResult(ResultCode.PARAMS_ERROR, list.get(0).getDefaultMessage());
                }
            }
        }

        try {
            if(result == null) {
                // 一切正常的情况下，继续执行被拦截的方法
                result = pjp.proceed(pjp.getArgs());
            }
        } catch(Throwable e) {
            if(!(e instanceof LotteryException)) {
                logger.error("执行 {} 方法异常", e, methodName);
            }

            result = new JsonResult(ResultCode.EXCEPTION, "发生异常：" + e.getMessage());
        }
        return result;
    }
}
