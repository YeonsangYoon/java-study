package com.sist.main;
/*
 *     1) 네트워크 프로그램
 *     2) 데이터베이스 프로그램
 *     ----------------------------- Spring
 *     데이터베이스는 데이터 저장 장소
 *     ------------------------ 자바에서 읽기 (메모리=>제어)
 *     1. 메모리에 저장 : 변수 => 제어 (제어문, 연산자)
 *     2. 데이터가 많은 경우
 *     3. 클래스
 *        = 클래스 정의 방법 (객체지향프로그램 => 여러개의 클래스끼리 연결관계를 맺는다)
 *                         클래스와 클래스의 연관관계 => Spring(DI))
 *                         행위자 (웹:사용자, 관리자)
 *          접근제어자
 *          private : 자신의 클래스에서만 접근 가능
 *          public : 모든 클래스에서 접근 가능
 *          default : 같은 패키지에서만 접근 가능
 *          protected : 같은 패키지 + 상속된 자식 클래스에서만 접근 가능
 *          ---------------------------------------------------
 *          private < default < protected < public
 *          => 오버라이딩 : 접근제어자의 확장은 가능(축소는 불가능)
 *          
 *     6장 시작
 *     => 재사용 기법
 *     => 수정, 추가
 *     => 클래스 종류
 *     --------------
 *     견고한 프로그램을 만든다
 *     -------------------
 *       재사용(상속, 포함) / 가독성(메소드) / 견고성 (예외처리)
 *       
 *     194page
 *      상속
 *        = 재사용 목적으로 사용한다 (기존의 만들어진 클래스를 확장해서 사용)
 *        *** 필요시에는 변경해서 사용이 가능 (오버라이딩)
 *        = 반복 코딩을 제거할 수 있다
 *        = 기존에 만들어진 클래스를 '확장'해서 새로운 클래스를 만들어서 사용
 *          (상속의 예약어가 extends인 이유)
 *        
 *      확장한다는 것 => 기존의 기능 사용 + 변경 + 추가
 */
class Data{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
class Human{
	public void getData() {
		Data d = new Data();
		d.setA(100);
	}
	public void print() {
		Data d=new Data();
		System.out.println("d.a="+d.getA());
	}
}
public class 상속_1 {
	public static void main(String[] args) {
		Human h = new Human();
		h.getData();
		h.print(); 
	}
}
