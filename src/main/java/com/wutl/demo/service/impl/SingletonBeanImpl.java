package com.wutl.demo.service.impl;

import com.wutl.demo.service.SingletonBean;
import com.wutl.demo.util.SpringBeanScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-2016:16
 */
@Service
@Scope(value = SpringBeanScope.SINGLETON)
public class SingletonBeanImpl implements SingletonBean {

    public SingletonBeanImpl(){
        System.out.println("SingletonBeanImpl..."+this.hashCode());
    }

    @Override
    public synchronized void save() {
        try {
            Thread.sleep(1000);
            System.out.println("SessionBeanImpl...save...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
