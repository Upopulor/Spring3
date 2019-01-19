package cn.wyc.Constructor7;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestS {
	@Test 
	public void t2() throws Exception {
		String xmlPath = "cn/wyc/Constructor7/SF.xml";
		ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext(xmlPath);
		User user = ca.getBean("userId",User.class);
		System.out.println(user);
	}
}
