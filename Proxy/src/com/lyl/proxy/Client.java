package com.lyl.proxy;
/**
 * ������
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
//		Car car=new Car();
//		car.move();
		//ͨ�����ɵķ�ʽ
//		Moveable car2=new Car2();
//		car2.move();
		//ͨ���ۺϵķ�ʽ
//		Car car=new Car();
//		CarTimeProxy car3=new CarTimeProxy(car);
//		car3.move();
		
		Car car=new Car();
		CarTimeProxy ctp=new CarTimeProxy(car);
		CarLogProxy clp=new CarLogProxy(ctp);
		clp.move();
	}
}
