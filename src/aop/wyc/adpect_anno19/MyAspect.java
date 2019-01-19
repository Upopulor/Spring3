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
 * �����ຬ�ж��֪ͨ
 * @author xd
 *
 */
@Component("MyAspectId")
@Aspect
public class MyAspect {
	//����㵱ǰ��Ч
	@Before("execution(* aop.wyc.adpect_anno19.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("ǰ��֪ͨ"+joinPoint.getSignature().getName());
	}
	//�����������ʽ
	@Pointcut("execution(* aop.wyc.adpect_anno19.UserServiceImpl.*(..))")
	private void myPointCut() {
		
	}
	@AfterReturning(value="myPointCut()",returning="ret")
	public void myAfter(JoinPoint joinPoint,Object ret) {
		//int i = 1/0;
		System.out.println("����֪ͨ"+joinPoint.getSignature().getName()+"---"+ret);
	} 
	@Around(value="myPointCut()")
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("ǰAround");
		//�ֶ�ִ��Ŀ�귽��
		Object proceed = joinPoint.proceed();
		System.out.println("��Around");
		return proceed;
	}
	@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("�׳��쳣"+e.getMessage());
	}  
	@After(value="myPointCut()")
	public void After(JoinPoint joinPoint) {
		System.out.println("����֪ͨ");
	}  
}
