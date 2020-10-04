package com.zb.threadTest.threadLocalTest;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/3 10:29 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("朱斌");
        System.out.println(threadLocal.get());
    }
}
