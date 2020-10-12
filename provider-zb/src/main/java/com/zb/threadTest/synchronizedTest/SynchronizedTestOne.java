package com.zb.threadTest.synchronizedTest;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/12 11:22 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class SynchronizedTestOne extends Thread{

    //定义票数为20
    private static volatile int tickNum = 20;

    private String name;

    public SynchronizedTestOne(String name) {
        this.name = name;
    }


    @Override
    public synchronized void run() {
        synchronized (SynchronizedTestOne.class) {
            while (tickNum > 0){
                if (tickNum == 0) {
                    break;
                }
                tickNum--;
                System.out.println( name + "当前票还剩" + tickNum + "张");
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedTestOne synchronizedTestOne = new SynchronizedTestOne("站台1");
        SynchronizedTestOne synchronizedTestOne1 = new SynchronizedTestOne("站台2");
        SynchronizedTestOne synchronizedTestOne2 = new SynchronizedTestOne("站台3");
        synchronizedTestOne.start();
        synchronizedTestOne1.start();
        synchronizedTestOne2.start();
    }
}
