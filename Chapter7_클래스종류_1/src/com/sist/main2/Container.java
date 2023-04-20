package com.sist.main2;
/*
 *   Object는 모든 클래스의 상위 클래스
 *   class A
 *   class B extends A {
 *      
 *      Object 
 *         |
 *         A
 *         |
 *         B
 *      
 */
public class Container {
	public Exec getBean(int no) {
		Exec o = null;
		if(no==1)
			o = new A();
		else if(no==2)
			o = new B();
		else if(no==3)
			o = new C();
		else if(no==4)
			o = new D();
		else if(no==5)
			o = new E();
		return o;
	}
}
