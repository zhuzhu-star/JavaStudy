package com.zb.thread_study;

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

     @SneakyThrows
     public synchronized void run() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String s : list) {
            System.out.println(Thread.currentThread().getName() + "正在运行第" + s);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        RunnabelDemo01 thread = new RunnabelDemo01();
        new Thread(thread).start();
        new Thread(thread,"线程A").start();
    }
}
