package cn.wyc.inject_factory4;
/**
 * ʵ������
 * @author xd
 *
 */
public class MyBeanFactory {
	//����ʵ��
	public  UserService createService() {
		return new UserServiceImpl();
	}
}
