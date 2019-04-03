package com.ctbu.srm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/3 16:04
 * @Email 308348194@qq.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//自定义注解类   ArchivesLog.java(获取Controller描述用的)
public @interface Log {
    String value() default "";
}
