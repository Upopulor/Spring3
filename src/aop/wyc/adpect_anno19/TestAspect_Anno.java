package aop.wyc.adpect_anno19;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAspect_Anno {
	@Test
	public void Demo1() {
		String xmlPath = "aop/wyc/adpect_anno19/bean.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		UserService service1 = cp.getBean("UserServiceId" ,UserService.class);
		service1.addUser();
		service1.updateUser();
		service1.deleteUser();
 	}
}
