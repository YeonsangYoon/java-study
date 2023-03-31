//문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
//      4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//      이를 판단하는 프로그램을 작성해보자.
//      점수가 0미만 100초과이면 경고문구 출력!
import java.util.Scanner;

public class 문제03 {
	public static void main(String[] args) {
		int grade, score;
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("학년 입력:");
		grade = Sc.nextInt();
		System.out.print("점수 입력:");
		score = Sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수입니다!");
		}
		else {
			if((grade == 4 && score >= 70) || (grade < 4 && score >= 60))
				System.out.println("합격입니다!");
			else
				System.out.println("불합격입니다!");				
		}
	}
}
