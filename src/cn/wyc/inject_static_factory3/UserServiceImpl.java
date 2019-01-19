package cn.wyc.inject_static_factory3;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("static_factory Add User");
	}

}
