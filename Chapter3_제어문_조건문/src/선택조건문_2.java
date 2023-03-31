// 한개의 점수를 받아서 60점이상 합격 아니면 불합격
import java.util.Scanner;
public class 선택조건문_2 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = Sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다");
		}
		else {
			System.out.println("불합격입니다");
		}
	}
}
