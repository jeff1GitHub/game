package com.sf.lottery.service;


import com.baomidou.mybatisplus.service.IService;
import com.sf.lottery.entity.Betting;

/**
 * <p>
 * 注单服务类接口
 * </p>
 *
 * @author jeff
 * @since 2017-12-30
 */
public interface IBettingService extends IService<Betting> {
    /**
     * 保存投注
     *
     * @param betting
     * @return
     */
    boolean saveBetting(Betting betting);

    /**
     * 分析注单
     *
     * @param lotteryId
     * @param period
     * @return
     */
    boolean analysis(Integer lotteryId, String period);

    /**
     * 结算注单
     *
     * @param lotteryId
     * @param period
     */
    boolean square(Integer lotteryId, String period);
}
