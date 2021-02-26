package com.wutl.demo.sjms.yzms;

import com.wutl.demo.sjms.yzms.fly.impl.FlyNoWay;
import com.wutl.demo.sjms.yzms.quack.impl.Quack;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-26 9:26
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyNoWay();
    }

    /**
     * 由子类自己实现的各自特殊身体颜色。
     */
    @Override
    void dispaly() {

    }
}
