package com.sist.lib;

import java.util.HashMap;
import java.util.Map;
interface M{
	void execute();
}
class A implements M{
	public void execute() {
		System.out.println("A:execute() Call...");
	}
}
class B implements M{
	public void execute() {
		System.out.println("B:execute() Call...");
	}
}
class C implements M{
	public void execute() {
		System.out.println("C:execute() Call...");
	}
}
// Sprint => 클래스 관리자
class Container{
	// 싱글턴 => 메모리 누수현상을 방지(한개의 객체로 재사용을 하는 프로그램)
	// Map => 클래스 관리시에 주로 사용한다
	Map map = new HashMap();
	public Container() {
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	public M getBean(String key) {
		return (M)map.get(key);
	}
	
}
public class 라이브러리_Map_2 {
	public static void main(String[] args) {
		Container c = new Container();
		M a = (A)c.getBean("a");
		a.execute();
		
		M b = (A)c.getBean("a");
		b.execute();
		
		System.out.println(a);
		System.out.println(b);
	}
}
