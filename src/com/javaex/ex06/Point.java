package com.javaex.ex06;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//equals 메소드가 없는데도 출력이 되는 이유는 모든 클래스는 Object라는 최상위클래스에 상속되어 있어서이다.
	//==는 주소값을 비교하여 출력이 되고 equals는 x와 y의 값이 완전 같고 p4와 p1도 같으니 true로 출력될 거 같다.
	//예상
	
	//true
	//false
	//false
	//true
	//true
	//true
	
	//정답
	//equals라고 재정의한 값이 없어 출력이 안 
	//true
	//false
	//false
	//true

	
	
}
