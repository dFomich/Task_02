package com.training.unit03.main;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// ��������� ����������� � ������������ �������� ����� a, b, c, � �����
		//��������� �������� ��������� a2-(b-c)2+ln(b2+1)
		
			
		try (Scanner sc = new Scanner (System.in)) {
		double a, b, c, result;
		String err = "�� ����� ������������ ��������. ���������.";
		System.out.println("������� �������� a: ");
		System.out.print("> ");
		
		while (!sc.hasNextDouble()){
				sc.nextLine();			
				System.out.println(err);
				System.out.print("> ");
				
		}		
		
		a = sc.nextDouble();
		
		
		System.out.println("������� �������� b: ");
		System.out.print("> ");
		while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.println(err);
				System.out.print("> ");
				
		}		
		b = sc.nextDouble();
		
		System.out.println("������� �������� c: ");
		System.out.print("> ");
		while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.println(err);
				System.out.print("> ");
				
		}		
		c = sc.nextDouble();
		
		result = Math.pow(a, 2) - Math.pow((b-c), 2) + Math.log(Math.pow(b, 2)+1);
		System.out.println("�����: " + result);		
		}
		
	

	}
		
	}


