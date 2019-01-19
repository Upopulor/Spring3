package aop.wyc.adpect_xml18;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * �����ຬ�ж��֪ͨ
 * @author xd
 *
 */
public class MyAspect {
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("ǰ��֪ͨ"+joinPoint.getSignature().getName());
	}
	public void myAfter(JoinPoint joinPoint,Object ret) {
		//int i = 1/0;
		System.out.println("����֪ͨ"+joinPoint.getSignature().getName()+"---"+ret);
	} 
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("ǰAround");
		//�ֶ�ִ��Ŀ�귽��
		Object proceed = joinPoint.proceed();
		System.out.println("��Around");
		return proceed;
	}
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("�׳��쳣"+e.getMessage());
	}  
	public void After(JoinPoint joinPoint) {
		System.out.println("����֪ͨ");
	}  
}
