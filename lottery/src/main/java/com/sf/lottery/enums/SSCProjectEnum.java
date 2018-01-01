package com.sf.lottery.enums;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 时时彩投注项枚举
 */
public enum SSCProjectEnum implements IEnum {
    ;

    private Integer code;
    private String name;
    private Integer type;

    @Override
    public Serializable getValue() {
        return this.code;
    }

    @JsonValue
    public Map<String, Object> getDesc() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("name", name);
        map.put("type", type);
        return map;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
