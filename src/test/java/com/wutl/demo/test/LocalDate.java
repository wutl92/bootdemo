package com.wutl.demo.test;

import com.wutl.demo.service.DemoInterface;
import com.wutl.demo.service.impl.DemoInterfaceImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author wutl
 * @Title: 测试类
 * @Package
 * @Description:
 * @date 2021-2-2010:15
 */
public class LocalDate {


    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = LocalDateTime.now().format(formatter);
        System.out.println(format);
//        DemoInterface demoInterface = new DemoInterfaceImpl();
//        demoInterface.log();

    }
}
