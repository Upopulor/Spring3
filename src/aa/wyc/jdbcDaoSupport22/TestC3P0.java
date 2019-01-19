package aa.wyc.jdbcDaoSupport22;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestC3P0 {
	@Test
	public void demo1() {
		String xmlPath = "aa/wyc/jdbcDaoSupport22/bean.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		UserDao ud = cp.getBean("UserdaoId" ,UserDao.class);
		List<User> aaa = ud.finaAll();
		for (User user1 : aaa) {
			System.out.println(user1.toString());
		}
	}
}
