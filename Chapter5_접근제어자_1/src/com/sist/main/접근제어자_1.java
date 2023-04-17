package com.sist.main;
/*
 *    객체지향 프로그램
 *    1) 클래스의 구성요소 => 클래스(모델링)
 *    2) 객체지향의 4대 요소
 *       = 캡슐화 : 데이터를 보호 (데이터 손실, 변경을 방지)
 *          => 접근하는 범위를 정의 (접근제어자)
 *       = 상속/포함 : 재사용
 *       = 오버라이딩/오버로딩 = 다형성 (수정, 추가가 가능)
 *       = 추상화
 *    3) 클래스의 종류
 *       = 추상 클래스 / 인터페이스
 *       = 내부 클래스
 *       = 종단 클래스
 *       = 공유 클래스
 *    4) API : 자바에서 지원하는 클래스 (라이브러리)
 *       java.lang
 *       java.util
 *       java.io
 *       java.net
 *    5) 클래스 조립법 : 사용자 정의 + 라이브러리
 *    --------------------------------------------
 *    오라클
 *    오라클 + 자바 연동
 *    --------------------------------------------
 *    웹 : HTML/CSS/JavaScript
 *        + 오라클 + 자바
 *        -------------------- JAP => 분리(출력 / 데이터 관리) => MVC
 *    --------------------------------------------
 *    스프링
 *    --------------------------------------------
 *    AWS
 *    --------------------------------------------
 *    개인 플젝 : React + SpringBoot + JPA
 *    
 *    
 *    1. 접근제어자의 종류
 *    ------------------------------------------------------------------
 *                  같은 클래스   같은 패키지   상속받은 클래스   모든 클래스
 *    ------------------------------------------------------------------
 *    private          O           X            X            X
 *    ------------------------------------------------------------------
 *    default          O           O            X            X
 *    ------------------------------------------------------------------
 *    protected        O           O            O            X
 *    ------------------------------------------------------------------
 *    public           O           O            O            O
 *    ------------------------------------------------------------------
 *    
 *    1) 변수 ==> private
 *    2) 메소드 ==> 다른 클래스와 연결(통신 수단) ==> public
 *    3) 생성자 ==> public (다른 클래스에서 메모리 할당후에 사용)
 *    -------------------------------------------------------
 *    4) class ==> public
 *    5) 조립 : 모든 클래스가 연결 (변수)
 *       변수는 private => 접근 메소드를 통해서 사용
 *       ------------- 은닉화 / 캡슐화
 *       1. 변수를 다른 클래스나 자신의 클ㄹ래스
 *          ---- 읽기/쓰기 (getter/setter)
 */
class Student{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	private int id;
	private String name;
	private int kor, eng, math;
}

public class 접근제어자_1 {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setId(1);
		s.setName("홍길동");
		s.setKor(89);
		s.setEng(90);
		s.setMath(98);
		
		System.out.println(s.getId() + " " + 
						s.getName() + " " +
						s.getKor() + " " + 
						s.getEng() + " "+ 
						s.getMath());
		
		/*
		 *  캡슐화를 사용하는 이유
		 *  외부에서 잘못된 사용이나 변수에 대한 손상을 방지하기 위해 사용
		 *  => 캡슐화를 사용하기 위해서 만드는 방법 => 접근제어자(private)
		 *  
		 */
	}
}
