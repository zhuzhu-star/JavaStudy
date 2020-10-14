package com.zb.threadTest.threadPoolTest;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/11 12:16 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ThreadPoolTestOne {

    public static void main(String[] args) {
        //创建线程池
        ExecutorService threadPool = new ThreadPoolExecutor(10,10,1000, TimeUnit.DAYS, new LinkedBlockingQueue<Runnable>(10));
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Lock lock = new ReentrantLock();
    }
}
