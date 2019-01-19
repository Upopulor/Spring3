package cn.wyc.inject_factory4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 实例工厂
 * @author xd
 *
 */
public class TestStaticFactory {
	//原来的工厂类
	@Test 
	public void t1() {
		//创建工厂
		MyBeanFactory mf = new MyBeanFactory();
		UserService userService = mf.createService();
		userService.addUser();
	}
	//spring实例工厂类
	@Test 
	public void t2() {
		String xmlPath ="cn/wyc/inject_factory4/SF.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(xmlPath);
		UserService us = app.getBean("userServiceId",UserService.class);
		us.addUser();
	}
}
