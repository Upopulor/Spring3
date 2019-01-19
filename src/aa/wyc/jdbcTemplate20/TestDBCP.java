package aa.wyc.jdbcTemplate20;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDBCP {
	@Test
	public void demo1() {
		User user = new User();
		user.setId(1);
		user.setUsername("ภ๎วเ");
		user.setPassword("uuu");
		String xmlPath = "aa/wyc/jdbcTemplate20/bean.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		UserDao ud = cp.getBean("UserdaoId" ,UserDao.class);
		ud.update(user);
	}
}
