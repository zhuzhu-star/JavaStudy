package com.zb.java基础;

import java.util.Random;

/**
 * @author ：zhubin
 * @date ：Created in 2020/6/16 2:39 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Math {
    //1-10000之间的随机数
    public static void main(String[] args) {
        System.out.println("这是1-10000之间的随机数" + new Random().nextInt(10000)%(10000) + 1);
    }
}
