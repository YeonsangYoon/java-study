package com.sist.main;
/*
 *    1. 사용처 => 응용
 *    
 *    인터페이스 : 추상클래스의 일종
 *    1) 다중상속이 가능
 *    2) 인터페이스는 클래스와 동일
 *    3) 설계만 되어 있다
 *    4) 표준화 가능 : 같은 메소드를 사용 (ex. Spring)
 *    5) 서로 관계 없는 클래스를 연결해서 사용이 가능(다형성)
 *    6) 유지보수가 편리하다
 *    7) 독립적으로 사용할 수 있다
 *    
 *    **클래스 여러개를 묶어서 한개의 이름으로 제어할 수 있다 
 *    
 *    형식)
 *    [접근지정어]interface InterfaceName {
 *       ---------------------------------
 *       상수
 *       (public static final) int a;
 *       ---------------------------------
 *       추상메소드
 *       (public abstract) void display();
 *       ---------------------------------
 *    }
 *    
 *    자동 추가
 *    1. import java.lang.*; => String, Math
 *    2. 메소드 => void aaa()
 *               {
 *                  => return;
 *               }
 *    3. 생성자
 *    4. 인터페이스 : 예약어 생략
 *       = 변수 : public static final
 *       = 메소드 : public abstract
 *       
 *       interface는 상수, 메소드 => public만 사용한다
 *    = 선언만 되어있다 => 상속을 내린다
 *      => 상속받은 클래스를 구현을 해서 사용 (오버라이딩)
 *    = 다중상속을 지원한다
 *    
 *    interface A
 *    class B extends A ==> 오류
 *    class B implements A ==> 구현후에 사용
 *    
 *    일반메소드
 *    interface A {
 *       JDK1.8이상
 *       default void display(){}
 *       abstract void doGame();
 *    }
 *    
 *    interface의 메소드를 구현할때는 반드시 public으로 구현해야함
 *    
 *    249page
 *    1) 인터페이스는 객체를 생성할 수 없다
 *    => 구현이 안된 메소드를 가지고 있기 때문에 메모리에 저장이 불가능
 *    2) 인터페이스는 다중상속이 가능하다
 *    	
 */
interface A {
	int a = 10;
	void aaa();
}
interface B {
	int a = 20;
	void bbb();
}
class C implements A, B{
	void print() {
		System.out.println(A.a);
		System.out.println(B.a);
	}

	@Override
	public void bbb() {
		System.out.println("B의 메소드 구현~");
	}

	@Override
	public void aaa() {
		System.out.println("A의 메소드 구현~");
	}
	
}
public class 인터페이스 {
	public static void main(String[] args) {
		C c = new C();
		c.print();
		c.aaa();
		c.bbb();
		
		A a = new C(); // A의 메서드만 사용 가능
		System.out.println(a.a);
	}
}
