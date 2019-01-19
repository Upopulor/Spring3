package cn.wyc.ioc1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	//之前
	@Test
	public void demo1() {
		UserService us = new UserServiceImpl();
		us.addUser();
	}
	//spring
	@Test
	public void demo2() {
		//1获得容器
		String xmlPath="applicationContext.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2获得内容 不需要new
		UserService us = (UserService) applicationContext.getBean("UserServiceId");
		us.addUser();
	}
}
