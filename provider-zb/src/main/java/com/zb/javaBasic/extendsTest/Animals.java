package com.zb.javaBasic.extendsTest;

import java.io.Serializable;

/**
 * @author ：zhubin
 * @date ：Created in 2020/9/15 1:13 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
//动物类，父类
public class Animals implements Serializable {

    private transient String name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

}
