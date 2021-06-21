package com.training.unit03.main;

public class Task07 {

	public static void main(String[] args) {
		// Даны три действительных числа. Возвести в квадрат те из них, значения
		//которых неотрицательны, и в четвертую степень — отрицательные.
		
		double num1, num2, num3;
		num1 = 2.2;
		num2 = -2.6;
		num3 = -3;
		
		if (num1 >= 0) {
			System.out.println("Число 1 = " + Math.pow(num1, 2));
		} else {
			System.out.println("Число 1 = " + Math.pow(num1, 4));
		}
		
		if (num2 >= 0) {
			System.out.println("Число 2 = " + Math.pow(num2, 2));
		} else {
			System.out.println("Число 2 = " + Math.pow(num2, 4));
		}
		
		if (num3 >= 0) {
			System.out.println("Число 3 = " + Math.pow(num3, 2));
		} else {
			System.out.println("Число 3 = " + Math.pow(num3, 4));
		}

	}

}
