package aop.wyc.adpect_anno19;

import org.springframework.stereotype.Service;

@Service("UserServiceId")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("adpect_anno add user");
	}

	@Override
	public String updateUser() {
		System.out.println("adpect_anno update user");
		return "aaa";
	}

	@Override
	public void deleteUser() {
		System.out.println("adpect_anno delete user");
	}

}
