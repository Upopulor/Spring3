package cn.wyc.inject_static_factory3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
	//ԭ���Ĺ�����
	@Test 
	public void t1() {
		UserService userService = MyBeanFactory.createService();
		userService.addUser();
	}
	//spring��̬������
	@Test 
	public void t2() {
		String xmlPath ="cn/wyc/inject_static_factory3/SF.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(xmlPath);
		UserService us = app.getBean("userServiceId",UserService.class);
		us.addUser();
	}
}
