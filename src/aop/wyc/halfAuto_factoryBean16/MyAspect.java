package aop.wyc.halfAuto_factoryBean16;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * ��������ȷ��֪ͨ����Ҫʵ�ֲ�ͬ�ӿڣ��ӿھ��ǹ淶������ȷ����������
 * ������û���֪ͨ MethodInterceptor
 * @author xd
 *
 */
public class MyAspect implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("ǰ----ǰ");
		//�ֶ�ִ��Ŀ�귽��
		Object proceed = mi.proceed();
		System.out.println("��----��");
		return proceed;
	}
}
