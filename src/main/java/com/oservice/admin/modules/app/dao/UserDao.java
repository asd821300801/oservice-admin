package com.oservice.admin.modules.app.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.oservice.admin.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author LingDu
 * @version 1.0
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
