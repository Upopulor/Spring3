package cn.wyc.liveCycle6;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
	@Test 
	public void t2() throws Exception {
		String xmlPath ="cn/wyc/liveCycle6/SF.xml";
		//ApplicationContext app = new ClassPathXmlApplicationContext(xmlPath);
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(xmlPath);
		UserService us = app.getBean("userServiceId",UserService.class);
		us.addUser();
		//要求 1容器必须close，销毁方法执行 2必须是单例的，多例无法销毁
		//此方法接口中没有定义，就是直接app.close发现没有方法，通过反射调用实现类里的close
		//app.getClass().getMethod("close").invoke(app);
		//2直接使用实现类 ClassPathXmlApplicationContext app
		app.close();
	}
}
