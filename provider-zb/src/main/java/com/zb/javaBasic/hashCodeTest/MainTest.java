package com.zb.javaBasic.hashCodeTest;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ：zhubin
 * @date ：Created in 2020/9/17 1:04 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class MainTest {

    public static void main(String[] arg){
        Person personFirst = new Person("朱斌","23");
        Person persontSecond = new Person("朱斌","23");

        System.out.println("personFirst的hashCode为:" + personFirst.hashCode());
        System.out.println("persontSecond的hashCode为:" + persontSecond.hashCode());

        System.out.println(personFirst.equals(persontSecond));

        Set hashSet = new HashSet();
        hashSet.add(personFirst);
        hashSet.add(persontSecond);
        System.out.println("hashSet 的size为:" + hashSet.size());

    }

}
