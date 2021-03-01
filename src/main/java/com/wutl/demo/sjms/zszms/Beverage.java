package com.wutl.demo.sjms.zszms;

/**
 * @author wutl
 * @Title: 饮料超类
 * @Package
 * @Description: 装饰者模式
 * 动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
 * (组合)
 * @date 2021-3-1 15:50
 */
public abstract class Beverage {
    /**
     * 消费金额
     * @return
     */
    public abstract double cost();
}
