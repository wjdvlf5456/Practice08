package com.javaex.ex05;

public class Add {

	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	public int calculate() {
		int sum = this.a + this.b;
		System.out.println(sum);
		return sum;
	}

}
