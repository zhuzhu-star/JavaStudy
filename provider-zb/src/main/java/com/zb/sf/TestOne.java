package com.zb.sf;

import java.io.InputStream;
/**
 * @author ：zhubin
 * @date ：Created in 2020/10/8 3:00 上午
 * @description： 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 *                如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * @modified By：
 * @version: 1.0
 */
public class TestOne {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        int l;
        byte[] bytes = new byte[1024];
        while ((l = inputStream.read(bytes)) > 0) {
            if(1 == l) {
                break;
            }
            String s = new String(bytes,0,l-1);
            Float f = Float.valueOf(s);
            System.out.println(Math.round(f));
        }
    }
}
