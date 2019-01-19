package aop.wyc.proxy.cglib;

public class UserServiceImpl {

	public void addUser() {
		System.out.println("proxy.cglib add user");
	}

	public void updateUser() {
		System.out.println("proxy.cglib update user");

	}

	public void deleteUser() {
		System.out.println("proxy.cglib delete user");
	}

}
