package cn.wyc.annotation_web11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	//spring
	@Test
	public void demo2() {
		//1�������
		String xmlPath="cn/wyc/annotation_web11/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2������� ����Ҫnew
		StudentAction us = (StudentAction) applicationContext.getBean("studentActionId");
		us.execute();
		//һֱ��������ʹ��xmlû���⣬����ʹ��ע��ͱ���ԭ����û�е���spring-aop-4.2.4.RELEASE.jar��������
	}
}
