package com.sist.main;

class Member{
	private String name; // 메모리에 읽기/쓰기
	private static Member mem;
	// 메모리에 저장된 데이터 읽기
	
	private Member() {}
	
	public static Member newInstance() {
		if(mem==null)
			mem = new Member();
		return mem;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class 정적초기화_싱글톤 {
	public static void main(String[] args) {
		Member m1 = Member.newInstance();
		Member m2 = Member.newInstance();
		
		System.out.println(m1);
		System.out.println(m2);
	}
}
