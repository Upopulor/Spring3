package aa.wyc.jdbcTemplate20;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {
	public static void main(String[] args) {
		//1��������Դ�����ӳأ�dbcp
		BasicDataSource bb = new BasicDataSource();
		//2����4��
		bb.setDriverClassName("com.mysql.jdbc.Driver");
		bb.setUrl("jdbc:mysql://localhost:3306/hibernate");
		bb.setUsername("root");
		bb.setPassword("root");
		//3 ����ģ��
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(bb);
		//4ͨ��api����
		jt.update("insert into t_user(username,password) values(?,?);", "���ȿ�","666");
		
	}
}






