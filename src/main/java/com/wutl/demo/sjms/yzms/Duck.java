package com.wutl.demo.sjms.yzms;

import com.wutl.demo.sjms.yzms.fly.FlyBehavior;
import com.wutl.demo.sjms.yzms.quack.QuackBehavior;

/**
 * @author wutl
 * @Title: 鸭子
 * @Package
 * @Description:
 * 『策略模式』定义了算法族（行为类），分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
 * 讲到设计模式…
 * 策略模式
 * 当你需要朋友对你印象深 刻，或是想影响关键主管 的 决 策 时 ， 请 使 用 『 这 个』定义
 *
 * 对于一个类，如果1个行为 有多种行为实现（多种行为动作），
 * 可以将行为实例化。例如创建飞行的接口，多个实现飞行接口的具体实现类。
 * 然后来集成具体实现类，就算有改动，或者添加行为，也不会影响现有实现的类。
 *
 * -- 一个类型对象，一个行为有很多种实现方式，可以通过定义行为类接口属性，在主类中通过委托的方式来统一实现，
 * 具体的实现方式，可以让实例自己初始化具体的具体行为（注入具体行为），然后又主类统一调用。
 * 用这种父类来实现的目的，可以减少代码个性化，减少硬编码。行为代码简洁。
 * @date 2021-2-26 9:21
 */
public abstract class Duck {

    /**
     * 委托代理来处理
     */
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    /**
     * 叫
     */
    public void quack() {
        quackBehavior.quack();
    }

    /**
     * 游泳
     */
    public void swin() {
        System.out.println("通用公共swin");
    }

    /**
     * 由子类自己实现的各自特殊身体颜色。
     */
    abstract void dispaly();

    public void fly() {
        flyBehavior.fly();
    }

    ;
}
