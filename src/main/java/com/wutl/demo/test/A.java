package com.wutl.demo.test;

import java.lang.reflect.Method;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-24 17:53
 */
public class A {

    private void test01(){

    }

    public void test02(){

    }

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a);
        Class<B> bClass = B.class;
        Method[] methods = bClass.getDeclaredMethods();
        methods = bClass.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            System.out.println(name);
        }
        a.test01();
    }
}
