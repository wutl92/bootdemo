package com.wutl.demo.sjms.gczms;


/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: 主题 GUI 设计很多采用了这种模式。 如事件。 按钮发送了变化（点击），则触发通知所有注册的点击事件对象。
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
