// 중첩 조건문 => 3개의 정수를 받아서, 총점 / 평균 / 학점(A+, A0, A-) 구하기
// 97 이상 A+
// 94 이상 A0
// 이하 A-
import java.util.Scanner;
public class 조건문_5 {
	public static void main(String[] args) {
		int a, b, c, total;
		double avg;
		char score = 'A', option = '-';
		
		// 입력
		Scanner Sc = new Scanner(System.in);
		System.out.print("세개의 점수를 입력 : ");
		a = Sc.nextInt();
		b = Sc.nextInt();
		c = Sc.nextInt();
		
		// 계산
		total = a + b + c;
		avg = (double)total/3;
		int tmp = (int)avg;
		
		if(tmp >= 90) {
			score = 'A';
			if(tmp >= 97)
				option = '+';
			else if(tmp >= 94)
				option = '0';
		}
		else if(tmp >= 80) {
			score = 'B';
		}
		else if(tmp >= 70) {
			score = 'C';
		}
		else if(tmp >= 60) {
			score = 'D';
		}
		else {
			score = 'F';
			option = ' ';
		}
		
		// 출력
		System.out.println("국어점수 : " + a);
		System.out.println("영어점수 : " + b);
		System.out.println("수학점수 : " + c);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f", avg).println();
		System.out.println("학점 : " + score + option);
	}
}
