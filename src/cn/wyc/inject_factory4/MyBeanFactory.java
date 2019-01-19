package cn.wyc.inject_factory4;
/**
 * 实例工厂
 * @author xd
 *
 */
public class MyBeanFactory {
	//创建实例
	public  UserService createService() {
		return new UserServiceImpl();
	}
}
