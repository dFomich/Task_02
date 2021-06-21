package com.training.unit03.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// Создать программу ввода целых чисел с клавиатуры, подсчета их суммы и
		//вывода результата на консоль.
		
		try(Scanner sc = new Scanner(System.in)) {
		int num1;
		int num2;
		String err = "Вы ввели не целое число!";
		
		System.out.println("Введите целое число: ");
		
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(err);
			System.out.println(">_ ");
			
		}
		
		num1 = sc.nextInt();
		
		System.out.println("Введите еще одно целое число: ");
	
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(err);
			System.out.println(">_ ");
		
		}
		num2 = sc.nextInt();
		
		
		
		System.out.println("Сумма двух чисел равна: " + (num1+num2));
		}
	}
}
