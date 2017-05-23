package com.nadan.java.tire3.design;

public abstract class Tire {
	
	protected int maxRotation; //타이어 최대 회전수
	protected int accumulatedRotation; // 회전한 횟수
	protected String location; //타이어 위치
	
	//타이어는 반드시 그 위치와 최대 회전수가 있어야 한다.
	public Tire(String location ,int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//타이어는 굴러가는 속성과 그에 따라 달아지는 속성이 있다.
	public abstract boolean roll(); //1회 굴러가는 메소드
	
	

}
