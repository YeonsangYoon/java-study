package com.sist.exam;

import java.util.Scanner;

public class MemberSystem {
	static int idx = 0;
	static Member[] members = new Member[10];
	// 오라클 => 모든 데이터 static
	// 가입
	public void join() {
		if(idx==10) {
			System.out.println("정원이 다 찼습니다!");
			return;
		}
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("아이디, 이름, 성별 입력(hong 홍길동 남자):");
		members[idx] = new Member();
		members[idx].setId(Sc.next());
		members[idx].setName(Sc.next());
		members[idx].setGender(Sc.next());
		idx++;
	}
	public void print() {
		for(Member m : members) {
			if(m!=null) {
				System.out.print(m.getId() + " ");
				System.out.print(m.getName() + " ");
				System.out.println(m.getGender());
			}
		}
	}
}
