package aop.wyc.Auto_SpringAop17;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("Auto_SpringAop add user");
	}

	@Override
	public void updateUser() {
		System.out.println("Auto_SpringAop update user");

	}

	@Override
	public void deleteUser() {
		System.out.println("Auto_SpringAop delete user");
	}

}
