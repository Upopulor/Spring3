package aop.wyc.proxy.jdk;

import org.junit.Test;

public class TestJDK {
	@Test
	public void Demo1() {
		UserService us = MyBeanFactory.createService();
		us.addUser();
		us.updateUser();
		us.deleteUser();
 	}
}
