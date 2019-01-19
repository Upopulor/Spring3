package aop.wyc.proxy.jdk;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("proxy.jdk add user");
	}

	@Override
	public void updateUser() {
		System.out.println("proxy.jdk update user");

	}

	@Override
	public void deleteUser() {
		System.out.println("proxy.jdk delete user");
	}

}
