package com.sist.lib;
// clone => 복제할때 사용 (메모리가 새롭게 생성) => prototype
class Employee implements Cloneable{
	private int id;
	private String name;
	
	// init
	public Employee() {
		this(1, "hong");
	}
	public Employee(int id, String name) {
		// 지역변수 우선순위 => 맴버변수와 지역변수의 구분 => this
		this.id=id;
		this.name=name;
	}
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		return (Employee)super.clone();
	}
	public void print() {
		System.out.println("사번:"+id+", 이름:"+name);
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
}

public class 라이브러리_Object_1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee s1 = new Employee(1, "홍길동");
		s1.print();
		Employee s2 = s1;
		s2.print();
		s1.setId(2);
		s1.setName("심청이");
		System.out.println("s1="+s1+", s2"+s2);
		
		//복제
		Employee s3 = s1.clone();
		s3.print();
		System.out.println("s3="+s3);
	}
}
