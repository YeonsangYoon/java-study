package com.sist.main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Sawon{
	private int id;
	private int pay;
	private String name;
	private String dept;
	private String loc;
	
}
public class 접근제어자_2 {
	public static void main(String[] args) {
		Sawon a = new Sawon();
		
		a.setId(1);
		a.setName("hong");
		a.setDept("개발부");
		a.setLoc("서울");
		a.setPay(3000);
		
		System.out.print(a.getId() + " ");
		System.out.print(a.getName() + " ");
		System.out.print(a.getDept() + " ");
		System.out.print(a.getLoc() + " ");
		System.out.print(a.getPay() + " ");
	}
}
