package com.wutl.demo.sjms.djms;

/**
 * @author wutl
 * @Title: 类里面的全局属性（静态的变量），不会被gc回收了。1.2版本以前存在此bug。
 * @Package
 * @Description: 单例模式
 * @date 2021-3-8 11:23
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    /**
     * 双重校验
     * @return
     */
    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            synchronized (Singleton.class){
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
