package com.wutl.demo.service.impl;

import com.wutl.demo.service.SessionBean;
import com.wutl.demo.util.SpringBeanScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-20 16:36
 */
@Service
@Scope(value = SpringBeanScope.SESSION)
public class SessionBeanImpl implements SessionBean {
    public SessionBeanImpl() {
        System.out.println("SessionBeanImpl..."+this.hashCode());
    }


}
