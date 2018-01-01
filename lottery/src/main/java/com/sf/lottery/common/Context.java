package com.sf.lottery.common;

import com.sf.lottery.entity.Lottery;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * 系统上下文
 */
@Component
public class Context {
    private Map<Integer, Lottery> lotteryMap;

    @PostConstruct
    private void init() {

    }

    public Lottery getLotteryById(Integer lotteryId) {
        return this.lotteryMap.get(lotteryId);
    }
}
