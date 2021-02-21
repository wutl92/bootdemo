package com.wutl.demo.test;

import com.wutl.demo.service.DemoInterface;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-2010:51
 */
public class TestMain {

    public static void main(String[] args) {
        DemoInterface demoInterface = (str) -> {
            System.out.println("222");
        };
        demoInterface.save("3333");
        List list = new ArrayList();
        list.add(null);
        list.forEach(n ->{
            System.out.println(n);
        });
        DemoInterface demoBoo = (str) -> System.out.println("111111111"+str);
        new Thread(()->{
            System.out.println("1");
        }).run();
        demoBoo.save("55555");

    }
}
