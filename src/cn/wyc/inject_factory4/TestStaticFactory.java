package cn.wyc.inject_factory4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * ʵ������
 * @author xd
 *
 */
public class TestStaticFactory {
	//ԭ���Ĺ�����
	@Test 
	public void t1() {
		//��������
		MyBeanFactory mf = new MyBeanFactory();
		UserService userService = mf.createService();
		userService.addUser();
	}
	//springʵ��������
	@Test 
	public void t2() {
		String xmlPath ="cn/wyc/inject_factory4/SF.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(xmlPath);
		UserService us = app.getBean("userServiceId",UserService.class);
		us.addUser();
	}
}
