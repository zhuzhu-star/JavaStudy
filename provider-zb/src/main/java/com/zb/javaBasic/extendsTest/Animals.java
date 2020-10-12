package com.zb.javaBasic.extendsTest;

import org.hibernate.validator.internal.util.privilegedactions.LoadClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author ：zhubin
 * @date ：Created in 2020/9/15 1:13 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
//动物类，父类
@Configuration
public class Animals implements Serializable {

    private transient String name;
    @Resource
    private String id;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    @Bean
    public static final void test(){

    }

    public static String test(String s){
        return s;
    }
}
