package com.zb.threadTest.synchronizedTest;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/14 2:27 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class SynchronizedTestThree implements Runnable{

    private static int count = 0;


    public static void main(String[] arg) {
        //起10个线程来执行这个任务
        for (int i = 0;i < 10;i++) {
            Thread thread = new Thread(new SynchronizedTestThree());
            thread.start();
            try {
                thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
        System.out.println(count);
    }
    @Override
        public void run() {
            for (int i = 0;i < 10000000;i++) {
                count++;
            }
        }


}
