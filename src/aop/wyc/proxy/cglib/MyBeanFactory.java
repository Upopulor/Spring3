package aop.wyc.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyBeanFactory {
	public static UserServiceImpl createService() {
		//1Ŀ����
		final UserServiceImpl us = new UserServiceImpl();
		//2������
		final MyAspect as = new MyAspect();
		//3������,����cglib���ײ㴴��Ŀ���������
		//3.1������
		Enhancer enhancer = new Enhancer();
		//3.2ȷ������
		enhancer.setSuperclass(us.getClass());
		//3.3���ûص����� MethodInterceptor��Ч��jdk invocationhandler�ӿ�
		/**
		 *  intercept��Ч��jdk��invoke()����
		 *  	����1������2������3��invokeһ��
		 *  	����4�������Ĵ���
		 */
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
				//ǰ����
				as.before();
				//ִ��Ŀ���෽��
				Object invoke = method.invoke(us, arg2);
				//ִ�д�����[proxy]�ĸ���-����Ŀ����[UserServiceImpl]��Ŀ����ʹ������Ǹ��ӹ�ϵ��,�������Ѿ�����һ��
				methodProxy.invokeSuper(proxy, arg2);
				//�󷽷�
				as.after();
				return invoke;
			}
		});
		//3.4��������
		UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();
		return proxyService;
	}
}
