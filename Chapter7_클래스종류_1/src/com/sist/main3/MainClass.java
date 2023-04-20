package com.sist.main3;
/*
 *   인터페이스 간의 상속
 *   interface A
 *   interface B extends A
 *   
 *   예)
 *   interface A {
 *      void aaa();
 *   }
 *   interface B extends A {
 *      void bbb();
 *   }
 *   
 *   class C implements B {
 *      public void aaa() {...}
 *      public void bbb() {...}
 *   }
 *   
 *   클래스 C가 인터페이스 B를 구현한다고 했을때 
 *   B뿐 아니라 B가 상속하는 상위 인터페이스까지 전부 구현해야한다
 */

interface A{
	
}
interface B extends A{
	
}
class C implements B{
	
}
public class MainClass {
	public static void main(String[] args) {
		A a = new C();
		B b = new C();
		C c = new C();
		
		if (c instanceof A)
			System.out.println("OK1");
		if (c instanceof B)
			System.out.println("OK2");
		if (b instanceof A)
			System.out.println("OK3");
		if (a instanceof C)
			System.out.println("OK4");
		if (a instanceof B)
			System.out.println("OK5");
	}
}
