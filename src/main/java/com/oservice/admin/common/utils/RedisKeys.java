package com.oservice.admin.common.utils;

/**
 * Redis所有Keys
 *
 * @author LingDu
 * @version 1.0
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
