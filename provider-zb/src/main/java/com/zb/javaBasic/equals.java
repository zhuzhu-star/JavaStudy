package com.zb.javaBasic;

import org.springframework.stereotype.Component;

/**
 * @author ：zhubin
 * @date ：Created in 2020/6/12 1:56 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class equals {
    public static void main(String[] args) {
        /**
         * 定义的String常量
         */
        String a = "ABC";
        String b = "ABC";
        Boolean flag1 = false;
        Boolean flag2 = false;
        if (a == b) {
            flag1 = true;
        }
        if (a.equals(b)) {
            flag2 = true;
        }
        System.out.println("a==b 的结果是:" + flag1);
        System.out.println("a.equals(b)的结果是:" + flag2);

        /**
         * new出来的String对象
         */
        String d = new String("1");
        String e = new String("1");

        System.out.println("new出来的String对象==对比结果是：" + d==e);
        System.out.println("new出来的String对象equals对比结果是：" + d.equals(e));



        /**
         * int基本类型的比较
         */
        int i = 1;
        int n = 1;
        System.out.println(i == n);

        /**
         * 基本封装类型的比较
         */
        Integer h = new Integer(1);
        Integer g = new Integer(1);
        Boolean flag3 = false;
        Boolean flag4 = false;
        if (h == g) {
            flag3 = true;
        }
        if (h.equals(g)) {
            flag4 = true;
        }
        System.out.println("基本数据类型==比较结果为：" + flag3);
        System.out.println("基本数据类型e.quals()比较结果为：" + flag4);
    }

}
