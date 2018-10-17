package com.oservice.admin.modules.sys.redis;

import com.oservice.admin.common.utils.RedisKeys;
import com.oservice.admin.common.utils.RedisUtils;
import com.oservice.admin.modules.sys.entity.SysConfigEntity;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 系统配置Redis
 *
 * @author LingDu
 * @version 1.0
 */
@Component
public class SysConfigRedis {

    @Resource
    private RedisUtils redisUtils;

    public void saveOrUpdate(SysConfigEntity config) {
        if(config == null){
            return ;
        }
        String key = RedisKeys.getSysConfigKey(config.getParamKey());
        redisUtils.set(key, config);
    }

    public void delete(String configKey) {
        String key = RedisKeys.getSysConfigKey(configKey);
        redisUtils.delete(key);
    }

    public SysConfigEntity get(String configKey){
        String key = RedisKeys.getSysConfigKey(configKey);
        return redisUtils.get(key, SysConfigEntity.class);
    }
}
