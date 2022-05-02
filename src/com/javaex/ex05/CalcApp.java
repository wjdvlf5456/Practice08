package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			String text = sc.nextLine();

			String[] textArray = text.split(" ");
			if (textArray[0].equals("/q")) {
				System.out.println("종료합니다.");
				break;
			} else {

				int a = Integer.parseInt(textArray[0]);
				int b = Integer.parseInt(textArray[2]);

				Add plus = new Add();
				plus.setValue(a, b);

				Sub minus = new Sub();
				minus.setValue(a, b);

				Mul multyply = new Mul();
				multyply.setValue(a, b);

				Div divide = new Div();
				divide.setValue(a, b);

				System.out.print(">> ");
				if (textArray[1].equals("+")) {
					plus.calculate();

				} else if (textArray[1].equals("-")) {
					minus.calculate();
				} else if (textArray[1].equals("*")) {
					multyply.calculate();
				} else if (textArray[1].equals("/")) {
					divide.calculate();
				} else {
					System.out.println("알 수 없는 연산입니다.");
				}

			}
		}

		sc.close();

	}
}
