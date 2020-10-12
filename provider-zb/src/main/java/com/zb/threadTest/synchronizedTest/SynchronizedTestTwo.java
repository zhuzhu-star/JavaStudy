package com.zb.threadTest.synchronizedTest;

import lombok.SneakyThrows;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/12 12:06 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class SynchronizedTestTwo implements Runnable{

    private String name;

    public SynchronizedTestTwo(String name) {
        this.name = name;
    }

    @Override
    @SneakyThrows
    public synchronized void run() {
        System.out.println(name + "获得了锁");
        Thread.sleep(1000);
        System.out.println(name + "释放了锁");
    }

    public static void main(String[] args) {
        SynchronizedTestTwo synchronizedTestTwo = new SynchronizedTestTwo("线程1");
        //SynchronizedTestTwo synchronizedTestTwo1 = new SynchronizedTestTwo("线程2");
        Thread thread = new Thread(synchronizedTestTwo);
        Thread thread1 = new Thread(synchronizedTestTwo);
        thread.start();
        thread1.start();
    }
}
