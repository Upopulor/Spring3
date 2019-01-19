package aop.wyc.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
	public static UserService createService() {
		//1目标类
		UserService us = new UserServiceImpl();
		//2切面类
		MyAspect as = new MyAspect();
		//3代理类，将目标类(切入点)和切面类（通知）结合-->切面
		/*  Proxy.newProxyInstance
		 * 		参数1：loader，类加载器，动态代理类 运行时创建，任何类都需要类加载器将其加载到内存
		 * 			一般情况下：当前类.class.getClassLoader();
		 * 					   目标类.getClass().getClassLoader();
		 * 		参数2：Class[] interfaces， 代理类需要实现的所有接口
		 * 			一般情况下下:方式1 目标类实例.getClass().getInterfaces(); 注意只能获得自己的接口，不能获得父元素的接口
		 * 					     方式2 new Class[]{UserService.class}  例如JDBC驱动
		 * 		参数3：InvocationHandler, 处理类接口 必须进行实现类，一般采用匿名内部类
		 * 			提供invoke方法，代理类的每一个方法执行时，都调用一次invoke
		 * 			参数31：Object proxy ,代理对象
		 * 			参数32：Method method,代理对象当前执行的方法的描述对象(反射)
		 * 				执行方法名：method.getName()
		 * 				执行方法：method.invoke(对象，实际参数)
		 * 			参数33：Object[] args,方法实际参数
		 */
		UserService proxyService = (UserService) Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), 
				us.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//前执行
						as.before();
						//执行目标类方法
						Object object = method.invoke(us, args);
						//后执行
						as.after();
						return object;
					}
				});
		return proxyService;
	}
}
