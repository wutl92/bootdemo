package com.wutl.demo.test;

import com.wutl.demo.service.PrototypeBean;
import com.wutl.demo.service.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/test1/bean")
@Controller
public class BeanTest1Controller {

    @Autowired
    private SingletonBean singletonBean;
    @Autowired
    private PrototypeBean prototypeBean;

    @RequestMapping("/test01")
    @ResponseBody
    public Map<String, Object> test01() {
        Map<String, Object> map = new HashMap<>();
        System.out.println(singletonBean);
        System.out.println(prototypeBean);
        map.put("singletonBean", singletonBean);
        map.put("prototypeBean", prototypeBean);
        return map;
    }
}
