package aa.wyc.jdbcTemplate_C3P0_21;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestC3P0 {
	@Test
	public void demo1() {
//		User user = new User();
//		user.setId(4);
//		user.setUsername("ÌáÄª");
//		user.setPassword("6667");
		String xmlPath = "aa/wyc/jdbcTemplate_C3P0_21/bean.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		UserDao ud = cp.getBean("UserdaoId" ,UserDao.class);
		List<User> aaa = ud.finaAll();
		for (User user1 : aaa) {
			System.out.println(user1.toString());
		}
	}
}
