package com.sist.main;
/*
 *  232 page
 *  -------- 추상클래스 (abstract)
 *           => 메소드 관련(구현이 안된 메소드), 상속 관련(오버라이딩)
 *           
 *           ** 오버라이딩 : 상속을 받아서 기존 기능 재정의(변경)
 *           1. 상속관계가 존재 : 추상클래스는 단독으로 사용이 불가능
 *           2. 메소드명 동일
 *           3. 리턴형 동일
 *           4. 매개변수가 동일
 *           5. 접근제어자는 확대/축소하면 오류 발생
 *           
 *    추상클래스의 기본적인 목적은?
 *    => 여러개의 클래스를 모아서 한개의 이름으로 제어
 *    
 *    프로그램 설계(미완성된 클래스)
 *    => 요구사항분석
 *    => 프로그램에 맞게 구현해서 사용
 *    
 *    추상클래스의 특징
 *    1) 단일상속 => extends
 *    2) 메소드가 구현이 안된것이 있으면 미완성 클래스
 *    => 메모리에 단독으로 저장이 불가능
 *    3) 상속을 내려서 구현된 클래스를 이용해서 메모리 할당
 *    4) 목적 : 관련된 여러 클래스를 묶어서 한개의 이름으로 관리
 *             --------------
 *             => 공통된 기능
 */
abstract class Shape{
	public abstract void draw();
	public void color() {
		System.out.println("검정색");
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("선을 그리다");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("원을 그리다");
	}
}
class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("네모을 그리다");
	}
}

public class 추상클래스 {
	public static void main(String[] args) {
		Shape a = new Line();
		Shape b = new Circle();
		Shape c = new Rectangle();
		
		a.draw();
		b.draw();
		c.draw();
	}
}
