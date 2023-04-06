import java.util.Scanner;
/*
 *  숫자 야구게임
 *  1. 컴퓨터 => 임의의 숫자 3개 발생(1~9까지 중복없는 난수)
 *  2. 사용자가 숫자를 입력해서 발생된 난수를 맞추는 게임
 *  3. 힌트 주는 방법
 *     3 6 9
 *     -----
 *     2 9 6  => 0S-2B
 *     3 7 8  => 1S-0B
 *     3 9 8  => 1S-1B
 */

public class 배열응용_4 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int cnt = 0;
		int[] com = new int[3];
		int[] user = new int[3];
		
		// 컴퓨터 난수 발생
		boolean[] check = new boolean[10];
		for(int i=0;i<com.length;i++) {
			int newNum = 0;
			while(true) {
				newNum = (int)(Math.random()*9)+1;
				if(!check[newNum]) {
					check[newNum]=true;
					break;
				}
			}
			com[i]=newNum;
		}
		
		// 게임 시작
		while(true) {
			// 사용자 입력
			System.out.print("세자리 정수 입력:");
			int input = Sc.nextInt();
			if(input<100 || input>=1000) {
				System.out.println("잘못된 입력입니다!");
				continue;
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2]) {
				System.out.println("잘못된 입력입니다!");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("잘못된 입력입니다!");
				continue;
			}
			cnt++;	// 입력 횟수 1증가
			
			// 힌트 계산
			int strike = 0, ball = 0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(user[i]==com[j]) {
						if(i==j)
							strike++;
						else
							ball++;
					}
				}
			}
			
			// 결과 출력
			if(strike == 3) {
				System.out.println("3 Strike!!!!");
				System.out.println("원래 숫자: "+com[0]+com[1]+com[2]);
				System.out.println("입력 횟수: "+cnt);
				break;
			}
			else {
				System.out.println("=========");
				System.out.println("S:"+strike);
				System.out.println("B:"+ball);
				System.out.println("=========");
			}
		}
	}
}
