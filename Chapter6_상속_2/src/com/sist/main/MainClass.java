package com.sist.main;
/*
 *    상속 => 재사용
 *    단점 : 실행속도가 늦다 (사용빈도 극히 드물다) => 포함 클래스 (has-a)
 *    
 *    상속 : 기능(메소드)를 수정하거나 변수를 추가해서 사용
 *    포함 : 제공한 그대로 사용 => 오버라이딩이 가능(익명의 클래스)
 *    
 *    상속을 받는 경우
 *    class A
 *    {
 *       int a;
 *       int b;
 *       static int c;
 *    }
 *    class B extends A
 *    {
 *       int d;
 *       int e;
 *       // int a, b
 *    }
 *    B b = new B(); => A객체가 먼저 생성, B객체가 생성된다
 *    
 */
class Super{
	int a, b;
	static int c;
	
	public Super() {
		System.out.println("Super클래스 메모리 할당");
	}
}

class Sub extends Super{
	int d ,e;
	public Sub() {
		System.out.println("sub클래스 메모리 할당");
		
	}
}

public class MainClass {
	public static void main(String[] args) {
		Sub s = new Sub();
	}
}
