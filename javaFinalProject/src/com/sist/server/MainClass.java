package com.sist.server;

import java.util.concurrent.ConcurrentHashMap;

/* 
 *    Thread 사용 방법
 *    1) 상속을 받는 방법
 *       재정의 => 변경해서 사용
 *         class A extends Thread {
 *         }
 *    2) 인터페이스 상속을 받는 방법 => 윈도우에서 주로 사용
 *         class A implements Runnable {
 *            public void run() {
 *            }
 *            run() 메소드는 쓰레드가 동작할 수 있게 제어
 *         }
 */
class MyThread extends Thread{
	// 각 쓰레드마다 => 쓰레드명을 설정 => Thread-0 ...
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(getName()+":"+i);
				Thread.sleep(100);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class MainClass {
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		MyThread m3 = new MyThread();
		/*
		 *     JVM역할
		 *     1) 이름 설정
		 *     2) 우선순위 결정 : 사용자 정의 thread는 NORM_PRIORITY(중간)
		 */
		System.out.println("m1=>"+m1.getName()+",우선순위"+m1.getPriority());
		System.out.println("m2=>"+m2.getName()+",우선순위"+m2.getPriority());
		System.out.println("m3=>"+m3.getName()+",우선순위"+m3.getPriority());
	}
}
