package aa.wyc.jdbcTemplate20;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {
	public static void main(String[] args) {
		//1创建数据源（连接池）dbcp
		BasicDataSource bb = new BasicDataSource();
		//2基本4项
		bb.setDriverClassName("com.mysql.jdbc.Driver");
		bb.setUrl("jdbc:mysql://localhost:3306/hibernate");
		bb.setUsername("root");
		bb.setPassword("root");
		//3 创建模板
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(bb);
		//4通过api操作
		jt.update("insert into t_user(username,password) values(?,?);", "卡兹克","666");
		
	}
}






