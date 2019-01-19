package cn.wyc.scope_annotation13;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("userServiceId")
@Scope("prototype")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("factory Add User");
	}

}
