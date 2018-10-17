package com.oservice.admin.modules.app.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 *
 * @author LingDu
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginCheck {
}
