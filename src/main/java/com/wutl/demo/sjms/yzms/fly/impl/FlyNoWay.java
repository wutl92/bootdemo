package com.wutl.demo.sjms.yzms.fly.impl;

import com.wutl.demo.sjms.yzms.fly.FlyBehavior;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-26 11:08
 */
public class FlyNoWay implements FlyBehavior {
    /**
     * 飞行
     */
    @Override
    public void fly() {
        System.out.println("无飞行动作");
    }
}
