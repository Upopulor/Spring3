package cn.wyc.liveCycle6;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("liveCycle6 Add User");
	}
	public void myInit() {
		System.out.println("�ҵĳ�ʼ��");
	}
	public void myDestory() {
		System.out.println("�ҵ�����");
	}
}
