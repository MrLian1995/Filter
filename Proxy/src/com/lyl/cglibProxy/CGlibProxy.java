package com.lyl.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGlibProxy implements MethodInterceptor{

	private Enhancer enhancer=new Enhancer();
	
	public Object getProxy(Class clazz){
		//���ô����������
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	
	/**
	 * ��������Ŀ�귽���ĵ���
	 * obj Ŀ�����ʵ��
	 * method  Ŀ�귽���ķ������
	 * args ��������
	 * proxy   �������ʵ��
	 * 
	 */
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("��־����ʼ...");
		//��������ø���ķ���
		proxy.invokeSuper(obj, args);
		System.out.println("��־�������...");
		return null;
	}

}
