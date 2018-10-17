package com.oservice.admin.modules.job.task;

import com.oservice.admin.modules.sys.service.SysUserService;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 基础定时器
 *
 * baseTask为spring bean的名称
 *
 * @author LingDu
 * @version 1.0
 */
@Component("baseTask")
public class BaseTask {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private SysUserService sysUserService;

	//参数务必使用String类型
	public void userTask(String params){
		logger.info(ToStringBuilder.reflectionToString(sysUserService.selectById(params)));
	}

}
