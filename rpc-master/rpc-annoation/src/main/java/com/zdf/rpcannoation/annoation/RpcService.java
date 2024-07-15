package com.zdf.rpcannoation.annoation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *@Description
 * 服务提供者注解
 * 服务名称
 * 服务版本号
 * 服务分组
 *@Author mrzhang
 *@Date 2024/7/15 23:11
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface RpcService {
    /**
     * 接口的class类
     */
    Class<?> interfaceClass() default void.class;
    /**
     * 接口的名称
     */
    String interfaceName() default "";
    /**
     * 接口的版本
     */
    String version() default "1.0.0";
    /**
     * 接口的分组
     */
    String group() default "";
}
