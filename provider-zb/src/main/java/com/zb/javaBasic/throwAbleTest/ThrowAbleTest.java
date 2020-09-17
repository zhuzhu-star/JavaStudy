package com.zb.javaBasic.throwAbleTest;

/**
 * @author ：zhubin
 * @date ：Created in 2020/9/17 2:08 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ThrowAbleTest {
    //子类Exception
    Throwable exception = new Exception();

    //子类Error
    Throwable error = new Error();


    static String test(){
        try {
            System.out.println("程序执行");
            return "程序返回";
        } finally {
            System.out.println("这是finally的内容");
        }
    }
    public static void main(String[] args){
        test();
    }
}
