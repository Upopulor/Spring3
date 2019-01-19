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
		//Ҫ�� 1��������close�����ٷ���ִ�� 2�����ǵ����ģ������޷�����
		//�˷����ӿ���û�ж��壬����ֱ��app.close����û�з�����ͨ���������ʵ�������close
		//app.getClass().getMethod("close").invoke(app);
		//2ֱ��ʹ��ʵ���� ClassPathXmlApplicationContext app
		app.close();
	}
}
