package com.nadan.java.tire3;

import java.util.ArrayList;

import com.nadan.java.tire3.design.CarInterface;
import com.nadan.java.tire3.design.Tire;

public class GoodCar implements CarInterface{
	
	int[] temp = new int[4];
	int count = 1;

	//�Ϲ� �ڵ������� ������ 4�� �ʿ��ϴ�
	ArrayList<Tire> tires = new ArrayList<>();
	HankookTire a; 
	HankookTire b;
	KumhoTire c; 
	KumhoTire d;
	
	//�޼ҵ忡 �ʱ�ȭ �ϰ�
	public void init(){
		a = new HankookTire("�����ʾ�", 30); tires.add(a);
		b = new HankookTire("���ʾ�", 30); tires.add(b);
		c = new KumhoTire("�����ʵ�", 25); tires.add(c);
		d = new KumhoTire("���ʵ�", 25);tires.add(d);
	}
	
	//�����ڿ� �ʱ�ȭ �޼ҵ带 �־������ν� �ڵ����� �ʱ�ȭ�� �� �Ӹ� �ƴ϶� �Լ��� �������� �����Ѵ�.
	public GoodCar(){
		init();
	}
	
	//�޸��� �޼ҵ�-�� �� �޸��� ������ �˻��ؼ� ���峭 ���� 1���� �־��ְ� ������ ���� 0�� �־��ش�.
	@Override
	public int[] run() {
		System.out.println(count+"ȸ ȸ��");
		int[] temp = new int[4];
		for(int i=0; i<4; i++){
			if(tires.get(i).roll() == false){
				stop();
				temp[i] = 1; //false�� ���� ���� 1���� �־��ش�.
				}
		}
		count++; //�� �� ȸ���ߴ��� Ȯ���Ѵ�. �� �� run �� ������ 1�� �����Ѵ�.
		System.out.println();
		return temp; //��� ���峵�¸� �����ϸ� changeTire���� ��ü���ش�. 
	}
	
	//���ϵ� temp�� �˻��Ͽ� 1���� ������ ���� �����ִ� �޼ҵ�
	public void changeTire(int[] temp){
		for(int i=0; i<4; i++){
			if(temp[i]==1){ //���峭 ���� �� Ÿ�̾�� ���� �����ش�.
				tires.set(i, new HankookTire("�����", 50));
			}
		}
	}

	@Override
	public void stop() {
		System.out.println("����");
	}
	
	

}
