package com.training.unit03.main;

public class Task05 {

	public static void main(String[] args) {
		// ¬ычислить значение выражени€ по формуле (все переменные принимают
		//действительные значени€)
		
		double a;
		double b;
		double c;
		double res;
		
		a = 1;
		b = 1.1;
		c = 12;
		
		res = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c + b);
		System.out.println("ќтвет: " + res);


	}

}
