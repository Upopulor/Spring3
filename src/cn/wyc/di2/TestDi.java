package cn.wyc.di2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
	//spring
	@Test
	public void demo2() {
		//1»ñµÃÈÝÆ÷
		String xmlPath="cn/wyc/di2/Di.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bk = (BookService) applicationContext.getBean("bookServiceId");
		bk.addBook();
	}
}
