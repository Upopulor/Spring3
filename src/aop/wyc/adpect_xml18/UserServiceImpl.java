package aop.wyc.adpect_xml18;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("adpect_xml add user");
	}

	@Override
	public String updateUser() {
		System.out.println("adpect_xml update user");
		return "aaa";
	}

	@Override
	public void deleteUser() {
		System.out.println("adpect_xml delete user");
	}

}
