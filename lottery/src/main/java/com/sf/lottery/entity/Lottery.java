package com.sf.lottery.entity;

import com.sf.lottery.enums.LotteryTypeEnum;

public class Lottery {

    private Integer id;
    private String name;
    private LotteryTypeEnum lotteryType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LotteryTypeEnum getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(LotteryTypeEnum lotteryType) {
        this.lotteryType = lotteryType;
    }
}
