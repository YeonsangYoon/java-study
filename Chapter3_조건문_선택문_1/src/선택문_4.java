// 중첩 switch
/*
 *    // 특별한 경우가 아니면 거의 사용빈도가 없다
 *    switch()
 *    {
 *     case 값:
 *        switch()
 *        {
 *        
 *        }
 *    }
 */
// 가위바위보 구현
import java.util.Scanner;
public class 선택문_4 {
	public static void main(String[] args) {
		// 컴퓨터가 먼저 가위바위보 설정
		// 사용자 입력
		// 비교 => 결과값 출력
		
		int comp = (int)(Math.random()*3);
		System.out.print("가위바위보를 내시오(가위(0), 바위(1), 보(2)):");
		Scanner Sc = new Scanner(System.in);
		int user = Sc.nextInt();
		
		switch(user) {
		case 0:
			System.out.println("User : 가위");
			switch(comp) {
			case 0:
				System.out.println("Com : 가위");
				System.out.println("비겼습니다");
				break;
			case 1:
				System.out.println("Com : 바위");
				System.out.println("User Lose");
				break;
			case 2:
				System.out.println("Com : 보");
				System.out.println("User Win!!");
				break;
			}
			break;
		case 1:
			System.out.println("User : 바위");
			switch(comp) {
			case 0:
				System.out.println("Com : 가위");
				System.out.println("User Win!!");
				break;
			case 1:
				System.out.println("Com : 바위");
				System.out.println("비겼습니다");
				break;
			case 2:
				System.out.println("Com : 보");
				System.out.println("User Lose");
				break;
			}
			break;
		case 2:
			System.out.println("User : 보");
			switch(comp) {
			case 0:
				System.out.println("Com : 가위");
				System.out.println("User Lose");
				break;
			case 1:
				System.out.println("Com : 바위");
				System.out.println("User Win!!");
				break;
			case 2:
				System.out.println("Com : 보");
				System.out.println("비겼습니다");
				break;
			}
			break;
		default:
			System.err.println("잘못된 입력입니다!");	
		}
	}
}
