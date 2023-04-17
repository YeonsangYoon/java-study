package com.sist.main;
/*
 *    접근제어자 : 접근 범위 지정 => 생성자, 메소드, 변수
 *    
 *    private : 자신의 클래스에서만 사용이 가능 => 맴버변수는 private
 *              = 다른 클래스와 연결 안됨
 *              = getter/setter 메소드로 접근 가능
 *              ------ 변수는 은닉화 메소드를 통해서 저근하는 방식 (캡슐화)
 *              ------ 은닉화 vs 캡슐화
 *              ------ 캡슐화 목적 : 데이터를 보호할 목적으로
 *    default : 같은 패키지안에서 접근
 *              => 한 파일에 class 두개를 만들지 않는다
 *    protected : 같은 패키지안 + 상속받은 자식에서 접근 가능
 *    public : 모든 클래스에서 접근 가능
 *    
 *    -----------------------------------------------------
 *    매개변수로 객체 전송 => 메모리 주소 (변경 => 자체가 변경)
 *    ==> 앝은 복사
 */
class Value{
	int a=10;
	int b=20;
}

public class 접근제어자 {
	static void swap(int a, int b) {
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println("a:"+a+", b:"+b);
	}
	static void swap(Value v) {
		int tmp = v.a;
		v.a=v.b;
		v.b=tmp;
		System.out.println("v.a:"+v.a+", v.b:"+v.b);
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		swap(x,y);
		System.out.println("x:"+x+", y:"+y);
		
		Value v = new Value();
		swap(v);	
		System.out.println("v.a:"+v.a+", v.b:"+v.b);
	}
}
