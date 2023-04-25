package com.sist.lib;
// toString() : 객체를 문자열화 시킨다
/*
 *    (String)
 *    .toString()
 *    ------------- 문자열 변환
 *    class A
 *    {
 *    }
 *    A a = new A();
 *    1) 명시적 => System.out.println(a.toString()) => a의 주소값 출력
 *    2) 묵시적 => System.out.println(a) => .toString()생략
 */
class Member{
	private int id;
	private String name;
	
	public Member() {
		this(1, "홍길동");
	}
	public Member(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "회원번호:"+id+", 이름:"+name;
	}
}
// 객체를 문자열로 변환
public class 라이브러리_Object_2 {
	public static void main(String[] args) {
		Member m1 = new Member(1, "홍길동");
		Member m2 = new Member(2, "심청이");
		System.out.println("묵시적: "+m1);
		System.out.println("명시적: "+m1.toString());
		System.out.println("묵시적: "+m2);
		System.out.println("명시적: "+m2.toString());
		System.out.println(m1.getClass().getName());
	}
}
