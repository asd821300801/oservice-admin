package com.oservice.admin.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * @author LingDu
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	String value() default "";
}
