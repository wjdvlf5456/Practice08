package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");

		// 코드를 작성하세요
		/*int sum = 0;
		while (true) {
		
			String numLine = sc.next();
			sum = sum + Integer.parseInt(numLine);
		
			if (numLine.equals("")) {
				break;
			}
			System.out.println("합:" + sum);
		
		}
		System.out.println("외곽: " + sum);
		*/

		int sum = 0;
		do {

			String numLine = sc.next();
			sum += Integer.parseInt(numLine);

		} while (sc.next().equals(null));
		System.out.println(sum);

		sc.close();
	}

}
