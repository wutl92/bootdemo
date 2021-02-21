package com.wutl.demo.test;

import com.wutl.demo.service.PrototypeBean;
import com.wutl.demo.service.RequestBean;
import com.wutl.demo.service.SessionBean;
import com.wutl.demo.service.SingletonBean;
import com.wutl.demo.util.SpringBeanScope;
import org.omg.IOP.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-20 16:38
 */
@RequestMapping("/test/bean")
@Controller
//@Scope(value = SpringBeanScope.PROTOTYPE)
public class BeanTestController {

    @Autowired
    private SingletonBean singletonBean;
    @Autowired
    private PrototypeBean prototypeBean;
    @Autowired
    public ApplicationContext applicationContext;

    @RequestMapping("/test01")
    @ResponseBody
    public Map<String, Object> test01() {
        Map<String, Object> map = new HashMap<>();
        PrototypeBean bean = applicationContext.getBean(PrototypeBean.class);
        PrototypeBean bean1 = applicationContext.getBean(PrototypeBean.class);
        System.out.println(bean);
        System.out.println(bean1);
        return map;
    }
}
