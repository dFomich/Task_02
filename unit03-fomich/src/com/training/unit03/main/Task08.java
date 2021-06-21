package com.training.unit03.main;

public class Task08 {

	public static void main(String[] args) {
		// ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b]
		//� ����� h. ��������� ����������� � ���� �������, ������ ������� ������� �
		//�������� ���������, ������ - ��������������� �������� �������
			
		double a, b, h, y;
		a = 1;
		b = 15.6;
		h = 0.1;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <=b; x = x + h) {
			y = 2 * Math.tan(x / 2) + 1;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
		
		
	}

}
