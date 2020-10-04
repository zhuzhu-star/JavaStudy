package com.zb.javaBasic.extendsTest;

/**
 * @author ：zhubin
 * @date ：Created in 2020/9/15 1:14 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Person extends Animals{
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.setName("animals");
        Person person = new Person();
        System.out.println(person.getName());
    }
}
