package com.wutl.demo.sjms.gczms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
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
