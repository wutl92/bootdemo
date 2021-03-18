package com.wutl.demo.sjms.spqms;

/**
 * @author wutl
 * @Title: 对象适配器
 * @Package
 * @Description:
 * @date 2021-3-18 14:40
 */
public class ObjectAdapter implements TargetInterface {

    private People people;

    ObjectAdapter(People people){
        this.people = people;
    }

    @Override
    public void run() {
        people.walk();
    }
}
