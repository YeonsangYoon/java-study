package com.sist.exam1;

public class HelloImp1 implements Hello{

	@Override
	public void sayHello(String name) {
		System.out.println(name + "님 환영합니다");
	}
	
}
