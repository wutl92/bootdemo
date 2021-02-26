package com.wutl.demo.sjms.gczms;


/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: 主题
 * @date 2021-2-26 16:04
 */
public interface Subject {
    /**
     * 注册
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 解除注册
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知
     */
    void notifyObservers();
}
