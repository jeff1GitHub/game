package com.sf.lottery.service;

import com.sf.lottery.entity.Betting;
import com.sf.lottery.enums.LotteryTypeEnum;

public interface ILotteryService {
    // TODO 彩票投注方法
    boolean saveBetting(Betting betting);

    // TODO 彩票开奖方法
    void openReward();

    /**
     * 获取彩票类型
     */
    LotteryTypeEnum getLottyerType();

    /**
     * 结算方法
     * @param lottery
     * @param period
     * @return
     */
    boolean square(Integer lottery, String period);
}
