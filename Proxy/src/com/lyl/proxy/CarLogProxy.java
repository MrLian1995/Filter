package com.lyl.proxy;

public class CarLogProxy implements Moveable{
	//ͨ���ۺϵķ�ʽʵ�־�̬����
	private Moveable m;
	public void move() {
		System.out.println("��־��ʼ����");
		//ͨ���ۺ�
		m.move();
		System.out.println("��־�������");
	}
	
	
	public CarLogProxy(Moveable m) {
		this.m = m;
	}
	

}
