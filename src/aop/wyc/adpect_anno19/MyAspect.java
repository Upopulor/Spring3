package aop.wyc.adpect_anno19;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类含有多个通知
 * @author xd
 *
 */
@Component("MyAspectId")
@Aspect
public class MyAspect {
	//切入点当前有效
	@Before("execution(* aop.wyc.adpect_anno19.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	//声明切入点表达式
	@Pointcut("execution(* aop.wyc.adpect_anno19.UserServiceImpl.*(..))")
	private void myPointCut() {
		
	}
	@AfterReturning(value="myPointCut()",returning="ret")
	public void myAfter(JoinPoint joinPoint,Object ret) {
		//int i = 1/0;
		System.out.println("后置通知"+joinPoint.getSignature().getName()+"---"+ret);
	} 
	@Around(value="myPointCut()")
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("前Around");
		//手动执行目标方法
		Object proceed = joinPoint.proceed();
		System.out.println("后Around");
		return proceed;
	}
	@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("抛出异常"+e.getMessage());
	}  
	@After(value="myPointCut()")
	public void After(JoinPoint joinPoint) {
		System.out.println("最终通知");
	}  
}
