package cn.wyc.ioc_annotation10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	//spring
	@Test
	public void demo2() {
		//1获得容器
		String xmlPath="cn/wyc/ioc_annotation10/applicationContext.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2获得内容 不需要new
		UserService us = (UserService) applicationContext.getBean("UserServiceId");
		us.addUser();
	}
}
