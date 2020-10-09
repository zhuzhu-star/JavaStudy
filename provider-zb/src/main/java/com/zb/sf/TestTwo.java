package com.zb.sf;

import java.util.Scanner;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/8 3:34 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class TestTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n > 0) {
            if ((n & 1) > 0 ) {
                count++;
            }
            n = n>>1;
        }
        System.out.println(count);
    }
}
