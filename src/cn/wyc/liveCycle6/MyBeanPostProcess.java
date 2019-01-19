package cn.wyc.liveCycle6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcess implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("ǰ����" +beanName);
		return bean;//�������returnnull���ᵼ�·��ص�ԭ����Ϊnull����ô���潫�޷�ʹ�ã��ᵼ�¿�ָ���쳣
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
		System.out.println("�󷽷�" +beanName);
		//���ɴ���
		//bean Ŀ�����
		return Proxy.newProxyInstance(MyBeanPostProcess.class.getClassLoader(),
						bean.getClass().getInterfaces(), new InvocationHandler() {
							
							@Override
							public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
								System.out.println("��������");
								//ִ��Ŀ�귽��
								Object obj = method.invoke(bean, args);
								System.out.println("�ύ����");
								return null;
							}
						});
	}

	

}
