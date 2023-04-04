// 가위바위보 게임
import java.util.Scanner;
public class 반복문_5 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int win = 0, lose = 0, same = 0;
		
		while(true) {
			System.out.print("가위(0), 바위(1), 보(2), 종료(9):");
			int user = Sc.nextInt();
			int com = (int)(Math.random()*3);
			
			if(user == 9) {
				System.out.println("게임 종료!");
				break;
			}
			
			if(com == 0)
				System.out.println("컴퓨터 : 가위");
			else if(com == 1)
				System.out.println("컴퓨터 : 바위");
			else if(com == 2)
				System.out.println("컴퓨터 : 보");

			if(user == 0)
				System.out.println("사용자 : 가위");
			else if(user == 1)
				System.out.println("사용자 : 바위");
			else if(user == 2)
				System.out.println("사용자 : 보");
			
			switch(com-user) {
			case -1: case 2:
				System.out.println("사용자 Win!!");
				win++;
				break;
			case -2: case 1:
				System.out.println("컴퓨터 Win!!");
				lose++;
				break;
			case 0:
				System.out.println("비겼다!!");
				same++;
				break;
			}
		}
		
		System.out.println("=============== 결과값 ===============");
		System.out.printf("%d전 %d승 %d패 %d무", win+lose+same,win,lose,same);
	}
}
