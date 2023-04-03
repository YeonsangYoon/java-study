/*
 * Web개발/호스팅(AWS) => 운영체제와 고정ip를 빌려서(PaaS)
 * ----------------------------------------------
 * Java / Oracle / HTML / CSS / JavaScript/
 * --------------------------------------- Spring / MyBatis / JPA
 * Java : 데이터 관리
 * Oracle : 데이터 저장(공유)
 * HTML/CSS : 브라우저에서 인식하는 언어
 * JavaScript : 동적(클라이언트)
 */

// 성적 계산
// 세개의 정수를 받아 평균을 구하고 등급을 출력
// 다중 조건문 사용
/*
 *    90이상
 *    80이상
 *    70이상
 *    60이상
 *    그 외
 */
import java.util.Scanner;
public class 다중조건문_2 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		// System.in 키보드 입력 => 입력값을 받아서 메모리에 저장해주는 역할
		// 정수 : nextInt(), 실수 : nextDouble(), nextBoolean()
		// next() : 문자열 => char는 존재하지 않는다
		// Scanner는 도스에서만 사용이 가능
		System.out.print("세개의 정수 입력:");
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();
		int avg = (a+b+c)/3;
		
		System.out.println("국어점수: " + a);
		System.out.println("영어점수: " + b);
		System.out.println("수학점수: " + c);
		
		System.out.println("총점: " + (a+b+c));
		System.out.printf("평균: %.2f", (a+b+c)/3.0).println();
		
		char score = 'F'; // 값의 변경이 없는 경우에 처리되는 값(default)
		if(avg >= 90)
			score = 'A';
		else if(avg >= 80)
			score = 'B';
		else if(avg >= 70)
			score = 'C';
		else if(avg >= 60)
			score = 'D';
		System.out.println("학점: " + score);
	}
}
