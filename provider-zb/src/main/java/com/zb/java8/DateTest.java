package com.zb.java8;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
/**
 * @author ：zhubin
 * @date ：Created in 2020/3/24 3:01 下午
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
@Slf4j
public class DateTest {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.print(a);
    }
}
