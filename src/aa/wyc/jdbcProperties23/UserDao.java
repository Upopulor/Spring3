package aa.wyc.jdbcProperties23;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDao extends JdbcDaoSupport{

	public void update(User user) {
		String sql="update t_user set username=?,password=? where id=?";
		Object[] args= {user.getUsername(),user.getPassword(),user.getId()};
		this.getJdbcTemplate().update(sql,args);
	}

	public List<User> finaAll() {
		return this.getJdbcTemplate().query("select * from t_user", ParameterizedBeanPropertyRowMapper.newInstance(User.class));
	}

	public User findUserbyId(int id) {
		return this.getJdbcTemplate().queryForObject("select * from t_user where id=?", ParameterizedBeanPropertyRowMapper.newInstance(User.class),id);
	}
}
