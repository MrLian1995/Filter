package com.lyl.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * ʱ�����
 * @author Administrator
 *
 */
public class TimeProxy implements InvocationHandler{
	private Object target;

	/**
	 * proxy:���������
	 * method:���������ķ���
	 * args:��������
	 * 
	 * Object:��������ֵ
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		long starttime=System.currentTimeMillis();
		System.out.println("������ʼ��ʻ.....");
		method.invoke(target);
		long endtime=System.currentTimeMillis();
		System.out.println("����������ʻ.....��ʻ��"+(endtime-starttime)+"���룡");
		return null;
	}
	
	public TimeProxy(Object target) {
		super();
		this.target = target;
	}
}
