package cn.wyc.scope_annotation13;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * scope
 * @author xd
 *
 */
public class TestStaticFactory {
	@Test 
	public void t2() {
		String xmlPath ="cn/wyc/scope_annotation13/SF.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(xmlPath);
		UserService us = app.getBean("userServiceId",UserService.class);
		UserService us2 = app.getBean("userServiceId",UserService.class);
		System.out.println(us);
		System.out.println(us2);
	}
}
