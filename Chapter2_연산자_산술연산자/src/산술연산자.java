/*
 *   문법 핵심 : 변수, 연산자, 제어문, 메소드, 클래스
 *   이항 연산자 : 피연산자가 2개
 *    ***1) 산술연산자 (+, -, *, /, %)
 *       2) 쉬프트연산자 (비트이동) (<< , >>)
 *       3) 비트연산자 (&, |, ^)
 *    ***4) 비교연산자 (==, !=, <, >, <=, >=)
 *    ***5) 논리연산자 (&&(and), ||(or)) : 효율적인 연산
 *          && => true
 *          (조건) && (조건)
 *          -----    -----
 *          false 면 연산종료
 *          || => true
 *          (조건) || (조건)
 *          -----
 *          true 면 연산종료
 *    ***6) 대입연산자 (=, +=, -=, op=)
 *    
 *    page 38 => 산술연산자
 *    + - * => 형변환 *** 자바에서 모든 연산은 같은 데이터형끼리만 연산이 된다
 *             int + double => double + double
 *             ---             ------
 *             자동으로 큰 데이터형으로 형변환함
 *             예) 10 + 20.5 => 10.0 + 20.5 = 30.5
 *                'A' + 10 => 65 + 10 = 75
 *             *** char는 모든 연산자를 이용해서 연산처리하면 => 자동으로 int으로 변경
 *             *** int이하(byte, short, char) 데이터형 연산시에 결과값은 int다
 *                int + long = long
 *                int + double = double
 *                char + long = long
 *                byte + int = int
 *                char + char = int
 *                byte + byte = int
 *                
 *    / : 정수 / 정수 = 정수
 *        5 / 2 = 2
 *        10 / 3 = 3
 *        평균을 구하기 위해선 (정수/실수)를 해야함
 *        0으로 나누면 에러 발생
 *    
 *    % : 결과값은 왼쪽 부호가 남는다
 *        5 % 2 = 1
 *        -5 % 2 = -1
 *        5 % -2 = 1
 *        -5 % -2 = -1
 */
// 사용자가 정수 두개를 입력 => 결과값(1. 총점, 2. 평균)
import java.util.Scanner; // 외부에서 클래스를 불러온다
// 키보드로부터 입력된 값을 얻어오는 클래스
// BufferedReader => 예외처리

public class 산술연산자 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in); // 클래스 선언
//		             ---         ---------
//		       동적 메모리 할당      키보드 입력값
		System.out.print("국어점수 입력 : ");
		int koreanScore = Sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int mathScore = Sc.nextInt();
		System.out.print("영어점수 입력: ");
		int englishScore = Sc.nextInt();
		// 총점
		int totalScore = koreanScore + mathScore + englishScore;
		// 평균
		double avgScore = (double)totalScore / 3;
		// 결과값
		System.out.println("총점 : " + totalScore);
//		System.out.println("평균 : " + avgScore);
		System.out.printf("평균 : %.2f", avgScore);
	}
}
