package aop.wyc.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
	public static UserService createService() {
		//1Ŀ����
		UserService us = new UserServiceImpl();
		//2������
		MyAspect as = new MyAspect();
		//3�����࣬��Ŀ����(�����)�������֪ࣨͨ�����-->����
		/*  Proxy.newProxyInstance
		 * 		����1��loader�������������̬������ ����ʱ�������κ��඼��Ҫ�������������ص��ڴ�
		 * 			һ������£���ǰ��.class.getClassLoader();
		 * 					   Ŀ����.getClass().getClassLoader();
		 * 		����2��Class[] interfaces�� ��������Ҫʵ�ֵ����нӿ�
		 * 			һ���������:��ʽ1 Ŀ����ʵ��.getClass().getInterfaces(); ע��ֻ�ܻ���Լ��Ľӿڣ����ܻ�ø�Ԫ�صĽӿ�
		 * 					     ��ʽ2 new Class[]{UserService.class}  ����JDBC����
		 * 		����3��InvocationHandler, ������ӿ� �������ʵ���࣬һ����������ڲ���
		 * 			�ṩinvoke�������������ÿһ������ִ��ʱ��������һ��invoke
		 * 			����31��Object proxy ,�������
		 * 			����32��Method method,�������ǰִ�еķ�������������(����)
		 * 				ִ�з�������method.getName()
		 * 				ִ�з�����method.invoke(����ʵ�ʲ���)
		 * 			����33��Object[] args,����ʵ�ʲ���
		 */
		UserService proxyService = (UserService) Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), 
				us.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//ǰִ��
						as.before();
						//ִ��Ŀ���෽��
						Object object = method.invoke(us, args);
						//��ִ��
						as.after();
						return object;
					}
				});
		return proxyService;
	}
}
