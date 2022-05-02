package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");

		// 코드를 작성하세요
		int sum = 0;

		while (sc.hasNext()) {

			String numLine = sc.next();
			sum = sum + Integer.parseInt(numLine);

		}
		System.out.println("합:" + sum);

		sc.close();
	}

}
