package com.nadan.java.tire3.design;

public abstract class Tire {
	
	protected int maxRotation; //Ÿ�̾� �ִ� ȸ����
	protected int accumulatedRotation; // ȸ���� Ƚ��
	protected String location; //Ÿ�̾� ��ġ
	
	//Ÿ�̾�� �ݵ�� �� ��ġ�� �ִ� ȸ������ �־�� �Ѵ�.
	public Tire(String location ,int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//Ÿ�̾�� �������� �Ӽ��� �׿� ���� �޾����� �Ӽ��� �ִ�.
	public abstract boolean roll(); //1ȸ �������� �޼ҵ�
	
	

}
