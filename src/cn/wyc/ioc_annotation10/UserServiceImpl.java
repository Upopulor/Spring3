package cn.wyc.ioc_annotation10;

import org.springframework.stereotype.Component;

@Component("UserServiceId")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("ioc_annotation10 Add User");
	}

}
