package com.oservice.admin.modules.app.service;

import com.baomidou.mybatisplus.service.IService;
import com.oservice.admin.modules.app.entity.UserEntity;
import com.oservice.admin.modules.app.form.LoginForm;

/**
 * 用户
 *
 * @author LingDu
 * @version 1.0
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
