package com.javaex.ex05;

public class Sub {

	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public int calculate() {
		int minus = this.a - this.b;
		System.out.println(minus);
		return minus;
	}

}
