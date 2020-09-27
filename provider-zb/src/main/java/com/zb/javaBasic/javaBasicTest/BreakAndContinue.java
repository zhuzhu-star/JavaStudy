package com.zb.javaBasic.javaBasicTest;

/**
 * break是跳出当前循环，continue是结束本次循环，提前进入下次循环
 */
public class BreakAndContinue {

    public static void main(String[] args) {

        //breakTest
        System.out.println("breakTest");
        for (int i = 0;i < 5;i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        //continueTest
        System.out.println("continueTest");
        for (int i = 0;i < 5;i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
