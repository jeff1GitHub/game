package com.sf.lottery.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 注单类
 * @author jeff
 * @since 2017-12-31
 */
@TableName("t_betting")
public class Betting extends Model<Betting> {

    private static final long serialVersionUID = 1L;

    /**
     * 注单流水号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 期号
     */
    @NotEmpty(message = "期号不允许为空!")
    private String period;
    /**
     * 投注时间
     */
    @TableField("betting_time")
    private Date bettingTime;
    /**
     * 彩票id
     */
    @TableField("lottery_id")
    @NotNull(message = "彩票id为空")
    private Integer lotteryId;
    /**
     * 投注项
     */
    @NotNull(message = "投注项不允许为空")
    private Integer project;
    /**
     * 赔率
     */
    @NotNull(message = "赔率不允许为空")
    private Double odds;
    /**
     * 投注金额
     */
    @NotNull(message = "投注金额不允许为空")
    @Min(value = 0, message = "投注金额不能为负数")
    private Integer money;
    /**
     * 是否结算
     */
    private Integer square;
    /**
     * 结算时间
     */
    @TableField("square_time")
    private Date squareTime;
    /**
     * 是否派彩
     */
    private Integer prize;
    /**
     * 派奖时间
     */
    @TableField("prize_time")
    private Date prizeTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Date getBettingTime() {
        return bettingTime;
    }

    public void setBettingTime(Date bettingTime) {
        this.bettingTime = bettingTime;
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    public Double getOdds() {
        return odds;
    }

    public void setOdds(Double odds) {
        this.odds = odds;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public Date getSquareTime() {
        return squareTime;
    }

    public void setSquareTime(Date squareTime) {
        this.squareTime = squareTime;
    }

    public Integer getPrize() {
        return prize;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }

    public Date getPrizeTime() {
        return prizeTime;
    }

    public void setPrizeTime(Date prizeTime) {
        this.prizeTime = prizeTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Betting{" + "id=" + id + ", period=" + period + ", bettingTime=" + bettingTime + ", lotteryId=" + lotteryId + ", project=" + project + ", odds=" + odds + ", money=" + money + ", square=" + square + ", squareTime=" + squareTime + ", prize=" + prize + ", prizeTime=" + prizeTime + "}";
    }
}
