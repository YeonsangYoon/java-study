// 세개의 정수를 받아서 총점 / 평균 
import java.util.Scanner;
public class 반복제어문_3 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int a, b, c;
		
		while(true) {
			System.out.print("국어 점수 입력(0~100):");
			a = Sc.nextInt();
			if(a<0 || a>100) {
				System.out.println("잘못된 점수입니다");
				continue;
			}
			break;
		}
		while(true) {
			System.out.print("영어 점수 입력(0~100):");
			b = Sc.nextInt();
			if(b<0 || b>100) {
				System.out.println("잘못된 점수입니다");
				continue;
			}
			break;
		}
		while(true) {
			System.out.print("수학 점수 입력(0~100):");
			c = Sc.nextInt();
			if(c<0 || c>100) {
				System.out.println("잘못된 점수입니다");
				continue;
			}
			break;
		}
		
		int total = a+b+c;
		double avg = (double)total/3;
		
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f", avg);
	}
}
