package com.wutl.demo.service;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-2010:24
 */
public interface DemoInterface {

    void save(String str);


    default void log(){
        System.out.println("interface..log...");
    };
}
