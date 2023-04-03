// updown 게임
/*
 *     컴퓨터 난수 생성 (1 ~ 100 사이의 난수)
 *     이 난수를 맞추는 프로그램을 작성
 *     => 사용자 입력
 *     => 입력시에 힌트(up / down)
 *     => for문 횟수 ? 
 *        => 무한 루프를 줘야함
 *        => 조건문을 무조건 통과할 수 있도록 => 조건문이 없으면 가능
 *        for(;;) == while(true)
 */
import java.util.Scanner;
public class 반복문_6 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int com = (int)(Math.random()*100+1);
		int num, cnt = 0;
		
		for(;;) {
			System.out.print("숫자를 입력하세요 : ");
			num = Sc.nextInt();
			if(num >= 1 && num <= 100) {
				cnt++;
				if(num == com) {
					System.out.println(num + ": 정답입니다!!!");
					System.out.println("입력 횟수: " + cnt);
					System.exit(0);
				}
				else if(num > com) {
					System.out.println("Down");
				}
				else if(num < com) {
					System.out.println("Up");
				}
			}
			else {
				System.out.println("잘못된 입력입니다");
			}
		}
	}
}
