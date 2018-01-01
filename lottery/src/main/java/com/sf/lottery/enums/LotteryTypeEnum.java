package com.sf.lottery.enums;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 彩票大类枚举
 */
public enum LotteryTypeEnum implements IEnum {
    SSC(1, "时时彩"),;

    private Integer code;
    private String name;

    LotteryTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Serializable getValue() {
        return code;
    }

    @JsonValue
    public Map<String, Object> getDesc() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("name", name);
        return map;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


}
