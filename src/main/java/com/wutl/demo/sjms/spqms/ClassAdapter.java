package com.wutl.demo.sjms.spqms;

/**
 * @author wutl
 * @Title: 类适配器
 * @Package
 * @Description:
 * @date 2021-3-18 14:37
 */
public class ClassAdapter extends People implements TargetInterface   {

    @Override
    public void run() {
        walk();
    }
}
