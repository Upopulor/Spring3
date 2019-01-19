package cn.wyc.inject_factory4;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("factory Add User");
	}

}
