package com.sist.main2;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("해당 클래스 번호:");
		int no = Sc.nextInt();
		
		Container con = new Container();
		Exec e = con.getBean(no);
		e.execute();	
//		같은 메소드를 각 클래스에 맞게 구현한다음
//		여러 종류의 클래스를 하나의 타입으로 관리 및 메소드 호출 가능
		
//		if(no == 1) {
//			A a = (A)o;
//			a.execute();
//		}
//		else if (no == 2) {
//			B b = (B)o;
//			b.execute();
//		}
//		else if (no == 3) {
//			C c = (C)o;
//			c.execute();
//		}
//		else if (no == 4) {
//			D d = (D)o;
//			d.execute();
//		}
//		else if (no == 5) {
//			E e = (E)o;
//			e.execute();
//		}
	}
}
