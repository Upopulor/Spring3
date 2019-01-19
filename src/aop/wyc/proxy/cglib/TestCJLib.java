package aop.wyc.proxy.cglib;

import org.junit.Test;

public class TestCJLib {
	@Test
	public void Demo1() {
		UserServiceImpl us = MyBeanFactory.createService();
		us.addUser();
		us.updateUser();
		us.deleteUser();
 	}
}
