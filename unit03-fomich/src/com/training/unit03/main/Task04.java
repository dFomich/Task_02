package com.training.unit03.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// ������� ��������� ����� ����� ����� � ����������, �������� �� ����� �
		//������ ���������� �� �������.
		
		try(Scanner sc = new Scanner(System.in)) {
		int num1;
		int num2;
		String err = "�� ����� �� ����� �����!";
		
		System.out.println("������� ����� �����: ");
		
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(err);
			System.out.println(">_ ");
			
		}
		
		num1 = sc.nextInt();
		
		System.out.println("������� ��� ���� ����� �����: ");
	
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(err);
			System.out.println(">_ ");
		
		}
		num2 = sc.nextInt();
		
		
		
		System.out.println("����� ���� ����� �����: " + (num1+num2));
		}
	}
}
