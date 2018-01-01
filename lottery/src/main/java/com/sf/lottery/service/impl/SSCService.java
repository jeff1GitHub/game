package com.sf.lottery.service.impl;

import com.sf.lottery.entity.Betting;
import com.sf.lottery.enums.LotteryTypeEnum;
import com.sf.lottery.service.IBettingService;
import com.sf.lottery.service.ILotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSCService implements ILotteryService {

    @Autowired
    private IBettingService bettingService;

    @Override
    public boolean saveBetting(Betting betting) {
        return this.bettingService.insert(betting);
    }

    @Override
    public void openReward() {

    }

    @Override
    public LotteryTypeEnum getLottyerType() {
        return LotteryTypeEnum.SSC;
    }


    public boolean square(Integer lottery, String period) {
        return false;
    }
}
