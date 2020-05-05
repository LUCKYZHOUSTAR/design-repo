package com.lucky.demo.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 14:16
 */
public class AbilityContext {

    private Integer bizType;

    private Map<String, Object> paramMap = new HashMap<String, Object>();

    public <T> T getTypeParam(Class<T> clazz) {
        return (T)paramMap.get(clazz.getName());
    }

    public <T> T getParam(String key) {
        return (T)paramMap.get(key);

    }



    public void putParam(String key, Object object) {
        paramMap.put(key, object);
    }


    public <T, R extends T> void putTypeParam(R obj, Class<T> clazz) {

        paramMap.put(clazz.getName(), obj);
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }
}
