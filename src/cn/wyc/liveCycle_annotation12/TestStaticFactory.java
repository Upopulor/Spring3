package cn.wyc.liveCycle_annotation12;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
	@Test 
	public void t2() throws Exception {
		String xmlPath ="cn/wyc/liveCycle_annotation12/SF.xml";
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(xmlPath);
		UserService us = app.getBean("userServiceId",UserService.class);
		us.addUser();
		app.close();
	}
}
