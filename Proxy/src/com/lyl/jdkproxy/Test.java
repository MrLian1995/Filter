package com.lyl.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.lyl.proxy.Car;
import com.lyl.proxy.Moveable;

/**
 * JDK��̬���������
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Car car =new Car();
		InvocationHandler h=new TimeProxy(car);
		Class<?> cls = car.getClass();
		/**loader:   �������
		 * interfaces:  ʵ�ֽӿ�
		 * h:  InvocationHandler
		 */
		Moveable m=(Moveable)Proxy.newProxyInstance(cls.getClassLoader(), 
				cls.getInterfaces(), h);
		
		m.move();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
