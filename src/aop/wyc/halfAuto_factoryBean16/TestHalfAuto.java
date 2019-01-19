package aop.wyc.halfAuto_factoryBean16;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHalfAuto {
	@Test
	public void Demo1() {
		String xmlPath = "aop/wyc/halfAuto_factoryBean16/ss.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		//ԭ���ģ�û��֪ͨ����
		//UserService service = cp.getBean("UserServiceId" ,UserService.class);
		//��ô�����
		UserService service1 = cp.getBean("UserServiceProxyId" ,UserService.class);
		service1.addUser();
		service1.updateUser();
		service1.deleteUser();
 	}
}
