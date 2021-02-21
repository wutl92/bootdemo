package com.wutl.demo.service.impl;

import com.wutl.demo.service.Student;
import org.springframework.stereotype.Service;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-21 10:46
 */
@Service(value = "studentGirl")
public class StudentGirl implements Student {
    @Override
    public void work() {
        System.out.println("studentGirl...");
    }
}
