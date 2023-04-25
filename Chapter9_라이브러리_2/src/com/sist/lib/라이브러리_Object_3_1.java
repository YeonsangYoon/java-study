package com.sist.lib;
class Employee2{
	private int id;
	private String name;
	
	//init
	public Employee2() {}
	public Employee2(int id, String name) {
		this.id = id;
		this.name = name;
	}
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
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee2 e)
			return (this.id==e.getId()) && (this.name.equals(e.getName()));
		return (this == obj);
	}
	public void print() {
		System.out.println("사번:"+id+" 이름:"+name);
	}
}

public class 라이브러리_Object_3_1 {
	public static void main(String[] args) {
		Employee2 s1 = new Employee2(1, "홍길동");
		Employee2 s2 = new Employee2(1, new String("홍길동"));
		
		if(s1.equals(s2)) {
			System.out.println("같은 사원입니다");
		}
		else {
			System.out.println("다른 사원입니다");
		}
	}
}
