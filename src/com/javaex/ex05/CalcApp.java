package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print(">> ");
			int a = sc.nextInt();
			String arithmetic = sc.next();
			int b = sc.nextInt();

			System.out.print(a);
			System.out.print(arithmetic);
			System.out.print(b);

			Add plus = new Add();
			plus.setValue(a, b);

			Sub minus = new Sub();
			minus.setValue(a, b);

			Mul multyply = new Mul();
			multyply.setValue(a, b);

			Div divide = new Div();
			divide.setValue(a, b);

			// 연산결과
			System.out.println(">> ");
			if (arithmetic.equals("+")) {
				plus.calculate();

			} else if (arithmetic.equals("-")) {
				minus.calculate();

			} else if (arithmetic.equals("*")) {
				multyply.calculate();

			} else if (arithmetic.equals("/")) {
				divide.calculate();

			} else if (arithmetic.equals("/q")) {
				System.out.println("종료합니다.");
				break;

			} else {
				System.out.println("알 수 없는 연산입니다.");
			}

		}

		sc.close();

	}
}
