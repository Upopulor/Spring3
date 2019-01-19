package cn.wyc.liveCycle6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcess implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("前方法" +beanName);
		return bean;//如果这里returnnull，会导致返回的原对象为null，那么下面将无法使用，会导致空指针异常
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
		System.out.println("后方法" +beanName);
		//生成代理
		//bean 目标对象
		return Proxy.newProxyInstance(MyBeanPostProcess.class.getClassLoader(),
						bean.getClass().getInterfaces(), new InvocationHandler() {
							
							@Override
							public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
								System.out.println("开启事务");
								//执行目标方法
								Object obj = method.invoke(bean, args);
								System.out.println("提交事务");
								return null;
							}
						});
	}

	

}
