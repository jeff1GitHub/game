package com.sf.lottery.controller;


import com.sf.lottery.common.Context;
import com.sf.lottery.entity.Betting;
import com.sf.lottery.entity.Lottery;
import com.sf.lottery.exception.LotteryException;
import com.sf.lottery.service.IBettingService;
import com.sf.lottery.utils.JsonResult;
import com.sf.lottery.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jeff
 * @since 2017-12-30
 */
@RestController
@RequestMapping("/betting")
public class BettingController {

    @Autowired
    private Context context;

    @Autowired
    private IBettingService bettingService;

    /**
     * 玩家投注
     *
     * @param betting
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "betting", method = RequestMethod.POST)
    public JsonResult betting(@Valid Betting betting, BindingResult bindingResult) {
        JsonResult ret;

        // 获取彩票信息
        Lottery lottery = context.getLotteryById(betting.getLotteryId());
        if(lottery == null) {
            throw new LotteryException("彩票不存在!");
        }

        // 执行彩票投注方法
        if(bettingService.saveBetting(betting)) {
            ret = new JsonResult();
        } else {
            ret = new JsonResult(ResultCode.EXCEPTION);
        }
        return ret;
    }
}
