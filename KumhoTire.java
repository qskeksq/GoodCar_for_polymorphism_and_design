package com.nadan.java.tire3;

import com.nadan.java.tire3.design.Tire;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	//추상 메소드를 오버라이드 한다.
	public boolean roll(){
		//정상인 경우는 true, 비정상인 경우는 false를 리턴한다.
		boolean check = true; 
		//한 바퀴 돌 때마다 회전수가 1씩 쌓인다.
		accumulatedRotation++;
		//남은 회전수를 보여줘서 언제 갈아야 하는지 알려준다.
		int remainRotation = maxRotation-accumulatedRotation;
		String rr = "금호타이어 "+location+"바퀴의 남은 회전수 : "+remainRotation;
		System.out.println(rr);
		//만약 최대 회전수만큼 돌았다면 바퀴를 바꿔야 함을 알려주고, false를 리턴한다.
		if(maxRotation <= accumulatedRotation){
			System.out.print("<<<금호타이어 "+location+"바퀴 교환 필요>>>");
			check = false;
		}
		return check;
	}
	

}
