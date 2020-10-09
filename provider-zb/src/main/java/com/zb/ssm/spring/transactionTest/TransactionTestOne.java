package com.zb.ssm.spring.transactionTest;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/10 2:15 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class TransactionTestOne {

    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void test() {

    }
}
