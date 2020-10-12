package com.zb.threadTest;

public class ThreadDemo01 extends Thread{

    public static int age = 18;

    Thread t1 = new Thread("2");

    public ThreadDemo01(String id){

    }


    public ThreadDemo01(String id,String name) {

    }

    public void test() {

    }

    public void test(String id) {

    }

    public static void main(String[] args) {
        ThreadDemo01 threadDemo01 = new ThreadDemo01("实例1");
        ThreadDemo01 threadDemo02 = new ThreadDemo01("实例2");
        threadDemo01.age = 20;
        System.out.println(threadDemo02.age);
    }
}
