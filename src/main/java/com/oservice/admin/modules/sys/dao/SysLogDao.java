package com.oservice.admin.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.oservice.admin.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author LingDu
 * @version 1.0
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
