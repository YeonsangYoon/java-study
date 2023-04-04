import java.util.Scanner;
public class 문제07 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("점수 입력:");
		int score = Sc.nextInt();
		
		if(score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}
