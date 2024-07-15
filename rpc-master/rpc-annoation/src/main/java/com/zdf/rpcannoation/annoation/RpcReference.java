package com.zdf.rpcannoation.annoation;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description
 * 服务消费者注解
 * @Author mrzhang
 * @Date 2024/7/15 23:21
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Autowired
public @interface RpcReference {
    /**
     服务版本号
     */
    String version() default "1.0.0";
    /**
     服务分组
     */
    String group() default "";
    /**
     注册中心类型
     */
    String registryType() default "zookeeper";
    /**
     注册中心地址
     */
    String registryAddress() default "127.0.0.1:2181";
    /**
     负载均衡类型
     */
    String loadBalanceType() default "zkconsistenthash";
    /**
     序列化类型
     */
    String serializationType() default "protostuff";
    /**
    超时时间
     */
    long timeout() default 5000;
    /**
     是否异步调用
     */
    boolean async() default false;
    /**
     是否单向调用
     */
    boolean oneway() default false;
    /**
     反向代理类型
     */
    String proxy() default "jdk";
}
