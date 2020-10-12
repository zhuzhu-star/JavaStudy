package com.zb.threadTest.callableTest;

import java.util.concurrent.Callable;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/10 1:47 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class CallAbleTestOne implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread());
        return Thread.currentThread();
    }
}
