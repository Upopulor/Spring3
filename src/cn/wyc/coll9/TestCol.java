package cn.wyc.coll9;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCol {
	//spring
	@Test
	public void demo2() {
		//1»ñµÃÈÝÆ÷
		String xmlPath="cn/wyc/coll9/Di.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		CollDate p = (CollDate) applicationContext.getBean("collId");
		System.out.println(p);
	}
}
