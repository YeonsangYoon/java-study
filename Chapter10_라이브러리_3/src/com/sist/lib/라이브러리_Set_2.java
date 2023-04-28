package com.sist.lib;

import java.util.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Student{
	private String name;
	private int age;
	
	public Student() {this("홍길동", 25);};
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// equals()와 hashCode()를 name, age만 같으면 같은 객체로 판단할 수 있도록 재정의함
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s)
			return (this.name.equals(s.name) && this.age == s.age);
		return this == obj;
	}
	@Override
	public String toString() {
		return name+"("+age+")";
	}
}
public class 라이브러리_Set_2 {
	public static void main(String[] args) {
		// 객체 비교 => 메모리 주소, 실제 저장된 값
		// 오버라이딩하여 실제 저장된 값을 비교하도록함
		Set set = new HashSet();
		Student s1 = new Student();
		Student s2 = new Student();
		
		if(s1 == s2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		set.add(s1);
		set.add(s2);
		System.out.println(set);
		System.out.println(s1);
		System.out.println(s2);
	}
}
