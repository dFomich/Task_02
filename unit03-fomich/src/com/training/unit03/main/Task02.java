package com.training.unit03.main;

public class Task02 {

	public static void main(String[] args) {
		// Напишите программу нахождения гипотенузы и площади прямоугольного
		//треугольника по двум катетам.
		
		double leg1;
		double leg2;
		double ar;
		double hyp;
		
		leg1 = 5;
		leg2 = 7;
		
		ar = leg1 * leg2 / 2;
		hyp = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2,  2));
		System.out.println("Площадь треугольника равна: " + ar);
		System.out.println("Длина гипотенузы равна: " + hyp);

	}

}
