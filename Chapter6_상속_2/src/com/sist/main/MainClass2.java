package com.sist.main;
// 상속이 있는 경우 => 객체 생성 방법
// double d = 10; => d=10.0
/*
 *    A (상위 클래스)
 *    
 *    B (하위 클래스)
 *    
 *    ==> 크기 (범위) 상위 > 하위
 *        --------- 상속, 포함
 *        A > B
 *        ----- float > long
 *    
 *    A a = new A();
 *    A b = new B();
 *    B c = new B();
 *    B d = new A(); => (X)
 *    B e = (B)new A();
 *    
 *    
 *    상속
 *    1. 형식
 *       class A extends B => 단일 상속
 *    2. 클래스 크기
 *       상속을 내리는 클래스 > 상속을 받는 클래스
 *    3. 형변환
 *       작은 클래스 = 큰 클래스
 *    4. 자바의 최상위 클래스 => Object
 *    5. 상속의 예외 : static => 공유, 초기화블록, 생성자, private 접근이 안됨
 *    
 *    
 *    상속은 결국 기능 확장이라는 의미를 함축하고 있다
 *    예를 들어 그냥 평범한 리모컨 객체가 있고, 이를 상속하고 신기능이 추가된 신규 리모컨이 있다
 *    또한 클래스의 인스턴스를 만드는 것은 이러한 리모컨을 실제로 만들어내는 행위임
 *    
 *    class RemoteControl {...};
 *    RemoteControl rm = new RemoteControl();
 *    
 *    위 코드에 담긴 내용은 RemoteControl이라는 설계도로 만든 물건을 RemoteControl 타입으로 팔고 사용해라~
 *    라는 의미로 해석 할 수 있음
 *    
 *    class NewVersion extends RemoteContorl {...};
 *    
 *    이런 기존 리모컨을 상속하고 새로운 기능을 추가한 NewVersion 리모컨을 새로 출시했다고 생각해보자
 *    이때 이 새로운 리모컨을 기존의 리모컨으로 팔고 사용하는 건 가능할까?
 *    
 *    RemoteControl rm = new NewVersion();
 *    
 *    가능하다 왜냐하면 기존의 기능을 가지고 있고 신규 기능을 추가한 것처럼 '확장'된 형태이기 때문에
 *    신규 리모컨을 기존 리모컨으로 팔아도 기존 리모컨이 지원하는 모든 기능을 수행하기 때문에 아무런 문제가 안된다.
 *    
 *    그럼 반대로 기존의 리모컨을 신규 리모컨으로 팔고 사용하는 것은 가능할까?
 *    
 *    NewVersion rm = new RemoteControl();
 *    
 *    이건 불가능하다! 그동안 말해왔던걸 잘 생각해보면 불가능하다는 것은 당연하다. 
 *    기존 리모컨에서는 지원하지 않는 기능이 있어서 이를 신규 리모컨처럼 사용하는 것은 불가능하기 때문이다.
 *    
 *    결국 하위에 있는 클래스는 해당 클래스의 모든 상위 클래스 타입으로 사용하지만 그 반대의 경우엔 불가능하다.
 *    
 */
class Human{
	
}
class Student extends Human{
	
}
public class MainClass2 {
	// 클래스명과 생성자가 다른 경우
	/*
	 *   클래스명 변수명 = new 생성자()
	 *   ------            -------
	 *   1) 변수 제어 => 클래스타입 Human
	 *   2) 메소드 제어 => 생성자 타임 Student
	 */
	public static void main(String[] args) {
		Human h = new Human();
		Student s = new Student();
		Human h1 = new Student();
		Student s1 = (Student)new Human();
		
		// 사용 범위 ==> 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능하다
		// 변수 접근 => 선언된 클래스에 등록 변수까지만 접근이 가능
		// 실제 상속 => 라이브러리(윈도우, 데이터베이스)
	}
}
