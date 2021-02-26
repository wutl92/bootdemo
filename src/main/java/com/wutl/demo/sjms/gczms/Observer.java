package com.wutl.demo.sjms.gczms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: 它们之间可以互相替换，此模式 让算法的变化 观察者模式 独立于使用算法的客户。
 * ——在对象之间定义一 对多的依赖，这样一来，当一个对象改 变状态，依赖它的对象都会收到通知， 并自动更新。
 * @date 2021-2-26 16:04
 */
public interface Observer {
    /**
     * 观察者，需要实现的接手接口
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
