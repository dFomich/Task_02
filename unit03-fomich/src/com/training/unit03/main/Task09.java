package com.training.unit03.main;

public class Task09 {

	public static void main(String[] args) {
		// Вычислить значение функции
		
		double x;
		double fx;
				
		//x = -4;
		x = 6;
		
		if(x <= -3) {
			fx = 9;
			System.out.println("F(x) = " + fx);
		}else { 
			if(x > 3) {
	 
			fx = 1 / (Math.pow(x, 2) + 1);
			System.out.println("F(x) = " + fx);
		}		
		
	
		}
	}

}