package cn.wyc.liveCycle6;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("liveCycle6 Add User");
	}
	public void myInit() {
		System.out.println("我的初始化");
	}
	public void myDestory() {
		System.out.println("我的销毁");
	}
}
