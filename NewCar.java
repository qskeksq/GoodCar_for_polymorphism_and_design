package com.nadan.java.tire3;

public class NewCar {

	public static void main(String[] args) {
		
		GoodCar gc = new GoodCar();
		for(int i=0; i<100; i++){
			int[] temp = gc.run();
			gc.changeTire(temp);
		}

	}

}
