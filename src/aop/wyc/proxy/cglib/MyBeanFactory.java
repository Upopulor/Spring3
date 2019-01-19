package aop.wyc.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyBeanFactory {
	public static UserServiceImpl createService() {
		//1目标类
		final UserServiceImpl us = new UserServiceImpl();
		//2切面类
		final MyAspect as = new MyAspect();
		//3代理类,采用cglib，底层创建目标类的子类
		//3.1核心类
		Enhancer enhancer = new Enhancer();
		//3.2确定父类
		enhancer.setSuperclass(us.getClass());
		//3.3设置回调函数 MethodInterceptor等效于jdk invocationhandler接口
		/**
		 *  intercept等效于jdk的invoke()方法
		 *  	参数1，参数2，参数3与invoke一样
		 *  	参数4：方法的代理
		 */
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
				//前方法
				as.before();
				//执行目标类方法
				Object invoke = method.invoke(us, arg2);
				//执行代理类[proxy]的父类-就是目标类[UserServiceImpl]（目标类和代理类是父子关系）,和上面已经功能一样
				methodProxy.invokeSuper(proxy, arg2);
				//后方法
				as.after();
				return invoke;
			}
		});
		//3.4创建代理
		UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();
		return proxyService;
	}
}
