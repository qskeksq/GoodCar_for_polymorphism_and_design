package com.nadan.java.tire3;

import java.util.ArrayList;

import com.nadan.java.tire3.design.CarInterface;
import com.nadan.java.tire3.design.Tire;

public class GoodCar implements CarInterface{
	
	int[] temp = new int[4];
	int count = 1;

	//일반 자동차에는 바퀴가 4개 필요하다
	ArrayList<Tire> tires = new ArrayList<>();
	HankookTire a; 
	HankookTire b;
	KumhoTire c; 
	KumhoTire d;
	
	//메소드에 초기화 하고
	public void init(){
		a = new HankookTire("오른쪽앞", 30); tires.add(a);
		b = new HankookTire("왼쪽앞", 30); tires.add(b);
		c = new KumhoTire("오른쪽뒤", 25); tires.add(c);
		d = new KumhoTire("왼쪽뒤", 25);tires.add(d);
	}
	
	//생성자에 초기화 메소드를 넣어줌으로써 자동으로 초기화가 될 뿐만 아니라 함수의 독립성을 지향한다.
	public GoodCar(){
		init();
	}
	
	//달리는 메소드-한 번 달리고 바퀴를 검사해서 고장난 곳에 1값을 넣어주고 정상인 곳에 0을 넣어준다.
	@Override
	public int[] run() {
		System.out.println(count+"회 회전");
		int[] temp = new int[4];
		for(int i=0; i<4; i++){
			if(tires.get(i).roll() == false){
				stop();
				temp[i] = 1; //false가 나온 곳에 1값을 넣어준다.
				}
		}
		count++; //몇 번 회전했는지 확인한다. 한 번 run 할 때마다 1씩 증가한다.
		System.out.println();
		return temp; //어디가 고장났는리 리턴하면 changeTire에서 교체해준다. 
	}
	
	//리턴된 temp를 검사하여 1값이 나오면 갈아 끼워주는 메소드
	public void changeTire(int[] temp){
		for(int i=0; i<4; i++){
			if(temp[i]==1){ //고장난 곳은 새 타이어로 갈아 끼워준다.
				tires.set(i, new HankookTire("스페어", 50));
			}
		}
	}

	@Override
	public void stop() {
		System.out.println("멈춤");
	}
	
	

}
