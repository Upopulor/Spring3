package aop.wyc.Auto_SpringAop17;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto_SpringAop {
	@Test
	public void Demo1() {
		String xmlPath = "aop/wyc/Auto_SpringAop17/ss.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		//这里是目标类
		UserService service1 = cp.getBean("UserServiceId" ,UserService.class);
		service1.addUser();
		service1.updateUser();
		service1.deleteUser();
 	}
}
