package com.wutl.demo;

import com.wutl.demo.service.Student;
import com.wutl.demo.test.AutoMth;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
/**
 * 从spring-boot文档中找到解决方法，很简单，SpringBootTest增加webEnvironment 参数。
 * 不然web应用相关的类可能使用不了。
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CommonApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		AutoMth bean = applicationContext.getBean(AutoMth.class);
		bean.sout();
		Student studentBoy = applicationContext.getBean("studentBoy", Student.class);
		studentBoy.speeck();
	}

}
