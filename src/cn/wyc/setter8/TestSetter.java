package cn.wyc.setter8;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {
	//spring
	@Test
	public void demo2() {
		//1»ñµÃÈÝÆ÷
		String xmlPath="cn/wyc/setter8/Di.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		Person p = (Person) applicationContext.getBean("personId");
		System.out.println(p);
	}
}
