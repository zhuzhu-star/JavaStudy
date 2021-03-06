package com.zb.javaBasic.stringTest;

import org.springframework.stereotype.Component;

/**
 * @author ：zhubin
 * @date ：Created in 2020/9/15 11:07 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class StringTest {

    public void eat(){
        int a = 0;
        System.out.println(a);
        System.out.print("not static");
    }

    private String name;

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("stringBuffer");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stringBuilder");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        String a = "ab";
        String b = "a" + "b";
        System.out.println(a == b);
        //String转数组
        char[] c = a.toCharArray();
        for(char cr : c) {
            System.out.println(cr);
        }
    }
}
