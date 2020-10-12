package com.zb.threadTest;

import lombok.SneakyThrows;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：zhubin
 * @date ：Created in 2020/6/16 1:28 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class RunnabelDemo01 implements Runnable{

    private String name;

    public RunnabelDemo01(String name) {
        this.name = name;
    }

    @Override
    public synchronized void run() {
        for (int i = 0;i < 10;i++) {
            System.out.println( "线程名为" + name + "     " + i);
        }
    }

    public static void main(String[] args) {
        RunnabelDemo01 runnabelDemo01 = new RunnabelDemo01("runnabelDemo01");
        RunnabelDemo01 runnabelDemo02 = new RunnabelDemo01("runnabelDemo02");
        Thread thread = new Thread(runnabelDemo01);
        Thread thread1 = new Thread(runnabelDemo02);
        thread.start();
        thread1.start();
    }
}
