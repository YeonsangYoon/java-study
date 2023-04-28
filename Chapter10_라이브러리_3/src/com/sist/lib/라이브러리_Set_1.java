package com.sist.lib;
import java.util.*;

class Person implements Cloneable{
	private String name;
	private int age;
	
	public Person() {this("홍길동", 25);};
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"("+age+")";
	}
	@Override
	protected Person clone() {
		return new Person();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person p)
			return (this.name.equals(p.name) && this.age == p.age);
		return this == obj;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class 라이브러리_Set_1 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		Person p1 = new Person("홍길동",25);
		Person p2 = new Person("홍길동",25);
		Person p3 = p1;
		Person p4 = p1.clone();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
	}
}
