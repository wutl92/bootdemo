package com.wutl.demo.test;

import com.wutl.demo.service.PrototypeBean;
import com.wutl.demo.service.RequestBean;
import com.wutl.demo.service.SessionBean;
import com.wutl.demo.service.SingletonBean;
import com.wutl.demo.util.HttpUtil;
import com.wutl.demo.util.SpringBeanScope;
import org.omg.IOP.ServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
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
    public Map<String, Object> test01(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        PrototypeBean bean = applicationContext.getBean(PrototypeBean.class);
        PrototypeBean bean1 = applicationContext.getBean(PrototypeBean.class);
  /*      System.out.println(bean);
        System.out.println(bean1);
        String wutl = request.getHeader("Wutl");
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder("");
        try {
            br = request.getReader();
            String str;
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(wutl);
        System.out.println(sb.toString());*/
        String hee = request.getParameter("hee");
        System.out.println(hee);
        return map;
    }

    @RequestMapping("/test02")
    @ResponseBody
    public Map<String, Object> test02() {
        Map<String, Object> map = new HashMap<>();
        AutoMth bean = applicationContext.getBean(AutoMth.class);
        bean.sout();
        System.out.println(bean);
        HttpUtil.doPost("http://192.168.11.183:9191/test/bean/test01", null, "hee=11&ss=1&ddd=1");
        return map;
    }
}
