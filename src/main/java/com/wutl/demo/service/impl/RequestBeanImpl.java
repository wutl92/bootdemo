package com.wutl.demo.service.impl;

import com.wutl.demo.service.RequestBean;
import com.wutl.demo.util.SpringBeanScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-20 16:34
 */
@Service
@Scope(value = SpringBeanScope.REQUEST)
public class RequestBeanImpl implements RequestBean {
    public RequestBeanImpl() {
        System.out.println("RequestBeanImpl..."+this.hashCode());
    }
}
