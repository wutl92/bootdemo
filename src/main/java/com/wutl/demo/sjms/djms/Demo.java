package com.wutl.demo.sjms.djms;

import com.wutl.demo.sjms.yzms.fly.impl.FlyNoWay;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-3-4 17:48
 */
public class Demo {

    public static void main(String[] args) throws Exception{
        test();
        System.gc();
        Thread.sleep(5000);
    }

    public static void test(){
        Demo1 flyNoWay = new Demo1("1");
        flyNoWay.test01();
    }
}
