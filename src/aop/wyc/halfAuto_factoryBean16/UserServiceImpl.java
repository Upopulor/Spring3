package aop.wyc.halfAuto_factoryBean16;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("halfAuto_factoryBean add user");
	}

	@Override
	public void updateUser() {
		System.out.println("halfAuto_factoryBean update user");

	}

	@Override
	public void deleteUser() {
		System.out.println("halfAuto_factoryBean delete user");
	}

}
