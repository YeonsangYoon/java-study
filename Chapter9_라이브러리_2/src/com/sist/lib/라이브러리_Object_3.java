package com.sist.lib;
// equals => Object에서는 객체비교 String에서는 문자열
class Student2{
	private String name;
	
	public Student2() { this("홍길동"); }
	public Student2(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2)
			return this.name.equals(((Student2)obj).getName());
		return this == obj;
	}
	/*
	 *   Object의 기본 equals() 메소드는 두 객체의 주소값을 비교하지만,
	 *   각 클래스의 특징에 따라 값을 비교하도록 equals를 override할 수 있다.
	 *   ------------------------------------ Object의 equals 메소드
	 *   public boolean equals(Object obj) {
	 *      return (this == obj);
	 *   }
	 *   ------------------------------------
	 */
}
public class 라이브러리_Object_3 {
	public static void main(String[] args) {
		Student2 s1 = new Student2("홍길동");
		Student2 s2 = new Student2("홍길동");
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		if(s1==s2) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 다르다");
		}
		
		// default equals() : 주소값 비교
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 다르다");
		}
	}
}
