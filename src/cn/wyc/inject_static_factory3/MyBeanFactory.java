package cn.wyc.inject_static_factory3;

public class MyBeanFactory {
	//����ʵ��
	public static UserService createService() {
		return new UserServiceImpl();
	}
}
