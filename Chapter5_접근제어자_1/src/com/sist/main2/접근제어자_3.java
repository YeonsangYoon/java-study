package com.sist.main2;
// 접근 범위
// private < protected < default < public
class Member{
	private int mno; // Member클래스에서만 사용 가능
	public String name; // 모든 클래스(패키지가 달라도 된다)
	protected String address;
	String tel;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
}
public class 접근제어자_3 {
	public static void main(String[] args) {
		Member m = new Member();
		m.name = "홍길동";
		m.address = "서울";
		m.tel = "010-1111-1111";
		m.setMno(1);
		
		System.out.print(m.getMno() + " ");
		System.out.print(m.name + " ");
		System.out.print(m.address + " ");
		System.out.print(m.tel + " ");
	}
}
