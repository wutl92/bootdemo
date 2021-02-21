package com.wutl.demo.service.impl;

import com.wutl.demo.service.PrototypeBean;
import com.wutl.demo.util.SpringBeanScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-20 16:32
 */
@Service
@Scope(value = SpringBeanScope.PROTOTYPE)
public class PrototypeBeanImpl implements PrototypeBean {
    public PrototypeBeanImpl() {
        System.out.println("PrototypeBeanImpl..."+this.hashCode());
    }
}
