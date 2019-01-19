package aa.wyc.jdbcDaoSupport22;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDao extends JdbcDaoSupport{
	//由父类JdbcDaoSupport实现，这里就不用了
//	private JdbcTemplate jdbcTemplate;
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	public void update(User user) {
		String sql="update t_user set username=?,password=? where id=?";
		Object[] args= {user.getUsername(),user.getPassword(),user.getId()};
		this.getJdbcTemplate().update(sql,args);
	}

	public List<User> finaAll() {
		return this.getJdbcTemplate().query("select * from t_user", ParameterizedBeanPropertyRowMapper.newInstance(User.class));
	}
}
