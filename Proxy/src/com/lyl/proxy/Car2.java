package com.lyl.proxy;
/**
 * ͨ���̳�ʵ�־�̬����
 * @author Administrator
 *
 */
public class Car2 extends Car{

	public void move() {
		long starttime=System.currentTimeMillis();
		System.out.println("������ʼ��ʻ.....");
		super.move();
		long endtime=System.currentTimeMillis();
		System.out.println("����������ʻ.....��ʻ��"+(endtime-starttime)+"���룡");
	}
}
