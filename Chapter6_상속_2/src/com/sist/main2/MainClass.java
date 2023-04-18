package com.sist.main2;
/*
 *    오버라이딩 : 재정의
 *      = 변수 오버라이딩 : 변수명이 동일
 *      = 메소드 오버라이딩 : 메소드명이 동일
 *      -----------------------------
 *      
 *    다형성
 *                 오버로딩            오버라이딩
 *    ---------------------------------------
 *    클래스 관계    같은 클래스          상속 관계
 *    ---------------------------------------
 *    메소드명        동일                동일
 *    ---------------------------------------
 *    리턴형         관계없음              동일
 *    ---------------------------------------
 *    매개변수    개수, 데이터형이 다름       동일
 *    ---------------------------------------
 *    접근제어자     관계없음            확장이 가능
 *    ---------------------------------------
 *    목적       새호운 기능 추가      기존 기능 수정
 *    ---------------------------------------
 *    
 */
class Human{
	int a=10;
	
}
class Student extends Human{
	int a=20;
	public Student() {
		int a=30;
		System.out.println("a="+a);
		System.out.println("a="+this.a);
		System.out.println("a="+super.a);
	}
}
public class MainClass {
	public static void main(String[] args) {
		Student s = new Student();
//		System.out.println(s.a);
	}
}
