package com.sist.game;

import java.util.Scanner;

public class BaseBallGameMain {
	public static void main(String[] args) {
		BaseBallGame bbg = new BaseBallGame();
		while(true) {
			bbg.init();
			while(true) {
				int[] user = bbg.getUserInput();
				String result = bbg.getStrikeCntBallCnt(user);
				int no = bbg.getTryCount();
				System.out.println(no + "차시 : " + result);
				
				if(result.equals("3S-0B")) {
					System.out.println("\n========= Game Over!! =========");
					System.out.print("정답 : ");
					for(int i:user)
						System.out.print(i + " ");
					System.out.println();
					System.out.println("시도 횟수 : " + bbg.getTryCount());
					break;
				}
			}
			System.out.println("게임을 다시 하겠습니까? (y/n)");
			Scanner Sc = new Scanner(System.in);
			char c = Sc.next().charAt(0);
			
			if(c == 'n' || c == 'N')
				break;
		}
	}
}
