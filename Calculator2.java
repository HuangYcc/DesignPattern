package test;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		Double op1;
		Double op2;
		String op;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������(�س�����)");
		op1 = sc.nextDouble();
		System.out.println("�����������(�س�����)");
		op = sc.next();
		System.out.println("������ڶ���������(�س�����)");
		op2 = sc.nextDouble();
		System.out.print("����ǣ�");
		switch (op) {
		case "+":
			System.out.println(op1 + op2);
			break;
		case "-":
			System.out.println(op1 - op2);
			break;
		case "*":
			System.out.println(op1 * op2);
			break;
		case "/":
			System.out.println(op1 / op2);
			break;
		}
	}
}