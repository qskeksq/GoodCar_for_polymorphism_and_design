package com.nadan.java.tire3;

import com.nadan.java.tire3.design.Tire;

public class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	//�߻� �޼ҵ带 �������̵� �Ѵ�.
	public boolean roll(){
		//������ ���� true, �������� ���� false�� �����Ѵ�.
		boolean check = true;
		//�� ���� �� ������ ȸ������ 1�� ���δ�.
		accumulatedRotation++;
		//���� ȸ������ �����༭ ���� ���ƾ� �ϴ��� �˷��ش�.
		int remainRotation = maxRotation-accumulatedRotation;
		String rr = "�ѱ�Ÿ�̾� "+location+"������ ���� ȸ���� : " + remainRotation;
		System.out.println(rr);
		//���� �ִ� ȸ������ŭ ���Ҵٸ� ������ �ٲ�� ���� �˷��ְ�, false�� �����Ѵ�.

		if(maxRotation <= accumulatedRotation){
			System.out.print("<<<�ѱ�Ÿ�̾� "+location+"���� ��ȯ �ʿ�>>>");
			check = false;
		}
		return check;
	}

}
