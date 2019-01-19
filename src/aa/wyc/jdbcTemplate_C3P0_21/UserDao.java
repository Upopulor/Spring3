package aa.wyc.jdbcTemplate_C3P0_21;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;

public class UserDao {
	//jdbcÄ£°åÓÉspring×¢Èë
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void update(User user) {
		String sql="update t_user set username=?,password=? where id=?";
		Object[] args= {user.getUsername(),user.getPassword(),user.getId()};
		jdbcTemplate.update(sql,args);
	}

	public List<User> finaAll() {
		return jdbcTemplate.query("select * from t_user", ParameterizedBeanPropertyRowMapper.newInstance(User.class));
	}
}
