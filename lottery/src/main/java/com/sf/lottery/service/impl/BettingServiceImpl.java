package com.sf.lottery.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sf.lottery.entity.Betting;
import com.sf.lottery.mapper.BettingMapper;
import com.sf.lottery.service.IBettingService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 注单服务实现类
 * </p>
 *
 * @author jeff
 * @since 2017-12-30
 */
@Service
public class BettingServiceImpl extends ServiceImpl<BettingMapper, Betting> implements IBettingService {

    @Override
    public boolean saveBetting(Betting betting) {
        betting.setBettingTime(new Date());
        return this.insert(betting);
    }

    @Override
    public boolean analysis(Integer lotteryId, String period) {
        return false;
    }

    @Override
    public boolean square(Integer lotteryId, String period) {
        return false;
    }
}
