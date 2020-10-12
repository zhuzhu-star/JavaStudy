package com.zb.threadTest.callableTest;

import java.util.concurrent.FutureTask;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/10 2:03 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        CallAbleTestOne callAbleTestOne = new CallAbleTestOne();
        FutureTask<Thread> futureTask = new FutureTask<>(callAbleTestOne);
        new Thread(futureTask).start();
    }
}
