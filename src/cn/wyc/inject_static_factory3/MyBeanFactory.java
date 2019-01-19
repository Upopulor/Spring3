package cn.wyc.inject_static_factory3;

public class MyBeanFactory {
	//´´½¨ÊµÀý
	public static UserService createService() {
		return new UserServiceImpl();
	}
}
