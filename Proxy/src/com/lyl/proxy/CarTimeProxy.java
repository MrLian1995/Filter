package com.lyl.proxy;

public class CarTimeProxy implements Moveable{
	//ͨ���ۺϵķ�ʽʵ�־�̬����
	private Moveable m;
	public void move() {
		long starttime=System.currentTimeMillis();
		System.out.println("������ʼ��ʻ.....");
		//ͨ���ۺ�
		m.move();
		long endtime=System.currentTimeMillis();
		System.out.println("����������ʻ.....��ʻ��"+(endtime-starttime)+"���룡");
	}
	
	
	public CarTimeProxy(Moveable m) {
		this.m = m;
	}
	

}
