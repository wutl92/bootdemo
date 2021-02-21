package com.wutl.demo.test;

import com.wutl.demo.service.SingletonBean;
import com.wutl.demo.service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author wutl
 * @Title: 自动组装方法
 * @Package
 * @Description:
 * @date 2021-2-21 10:39
 */
@Component
public class AutoMth {


    private SingletonBean singletonBean;
    @Autowired
    @Qualifier("studentBoy")
    private Student studentBoy;
    @Resource(name = "studentGirl")
    private Student studentGirl;

    /**
     * 通过构造函数构建，注入bean。
     * 构造方法永远是第一执行。
     * @param singletonBean
     */
    @Autowired
    public AutoMth(SingletonBean singletonBean){
        this.singletonBean = singletonBean;
    }

    public void sout(){
        System.out.println(this.singletonBean);
        studentBoy.work();
        studentGirl.work();
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
