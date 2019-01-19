package aa.wyc.jdbcProperties23;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestProp {
	@Test
	public void demo1() {
		String xmlPath = "aa/wyc/jdbcProperties23/bean.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		UserDao ud = cp.getBean("UserdaoId" ,UserDao.class);
		List<User> aaa = ud.finaAll();
		for (User user1 : aaa) {
			System.out.println(user1.toString());
		}
		User user2 = ud.findUserbyId(1);
		System.out.println("----"+user2);
	}
}
