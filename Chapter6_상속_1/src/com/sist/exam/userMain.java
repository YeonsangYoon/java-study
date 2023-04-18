package com.sist.exam;

class User{
	MemberSystem ms = new MemberSystem();
	public void join() {
		ms.join();
	}
	public void print() {
		ms.print();
	}
}

public class userMain {
	public static void main(String[] args) {
		User hong = new User();
		hong.join();
		hong.print();
		
		User shim = new User();
		shim.join();
		shim.print();
		
		hong.print();
	}
}
