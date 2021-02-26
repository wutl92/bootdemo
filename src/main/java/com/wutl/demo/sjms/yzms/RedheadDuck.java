package com.wutl.demo.sjms.yzms;

import com.wutl.demo.sjms.yzms.fly.impl.FlyNoWay;
import com.wutl.demo.sjms.yzms.fly.impl.FlyWithWings;
import com.wutl.demo.sjms.yzms.quack.impl.Quack;
import com.wutl.demo.sjms.yzms.quack.impl.Squeak;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-26 9:27
 */
public class RedheadDuck extends Duck{

    public RedheadDuck(){
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyWithWings();
    }
    /**
     * 由子类自己实现的各自特殊身体颜色。
     */
    @Override
    void dispaly() {

    }
}
