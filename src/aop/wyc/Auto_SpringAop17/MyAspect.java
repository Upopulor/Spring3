package aop.wyc.Auto_SpringAop17;

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
		System.out.println("ǰ--SpringAop--ǰ");
		//�ֶ�ִ��Ŀ�귽��
		Object proceed = mi.proceed();
		System.out.println("��--SpringAop--��");
		return proceed;
	}
}
