package aop.wyc.Auto_SpringAop17;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类中确定通知，需要实现不同接口，接口就是规范，从容确定方法名称
 * 这里采用换套通知 MethodInterceptor
 * @author xd
 *
 */
public class MyAspect implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("前--SpringAop--前");
		//手动执行目标方法
		Object proceed = mi.proceed();
		System.out.println("后--SpringAop--后");
		return proceed;
	}
}
