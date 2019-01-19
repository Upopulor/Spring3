package aop.wyc.adpect_xml18;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类含有多个通知
 * @author xd
 *
 */
public class MyAspect {
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	public void myAfter(JoinPoint joinPoint,Object ret) {
		//int i = 1/0;
		System.out.println("后置通知"+joinPoint.getSignature().getName()+"---"+ret);
	} 
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("前Around");
		//手动执行目标方法
		Object proceed = joinPoint.proceed();
		System.out.println("后Around");
		return proceed;
	}
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("抛出异常"+e.getMessage());
	}  
	public void After(JoinPoint joinPoint) {
		System.out.println("最终通知");
	}  
}
