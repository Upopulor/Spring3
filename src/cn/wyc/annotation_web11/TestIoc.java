package cn.wyc.annotation_web11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	//spring
	@Test
	public void demo2() {
		//1获得容器
		String xmlPath="cn/wyc/annotation_web11/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2获得内容 不需要new
		StudentAction us = (StudentAction) applicationContext.getBean("studentActionId");
		us.execute();
		//一直报错，程序使用xml没问题，但是使用注解就报错，原因是没有导入spring-aop-4.2.4.RELEASE.jar包，谨记
	}
}
