package com.wutl.demo.sjms.yzms.quack.impl;

import com.wutl.demo.sjms.yzms.quack.QuackBehavior;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-26 11:09
 */
public class Quack implements QuackBehavior {
    /**
     * 叫
     */
    @Override
    public void quack() {
        System.out.println("这一类Quack叫");
    }
}
