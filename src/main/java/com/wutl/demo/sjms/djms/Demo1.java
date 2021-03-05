package com.wutl.demo.sjms.djms;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-3-4 17:49
 */
public class Demo1 {

    private String str;

    public Demo1(String str){
        System.out.println(str);
        this.str = str;
    }

    public void test01(){
        System.out.println(str);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("555555");
    }
}
