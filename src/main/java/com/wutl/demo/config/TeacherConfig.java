package com.wutl.demo.config;

import com.wutl.demo.entity.TeacherMan;
import com.wutl.demo.entity.TeacherWoman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-21 11:22
 */
@Configuration
public class TeacherConfig {
    @Bean
    public TeacherMan TeacherMan (){
        return new TeacherMan();
    }
    @Bean
    public TeacherWoman TeacherWoman (){
        return new TeacherWoman();
    }
}
