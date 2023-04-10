import java.util.Scanner;

/*
 *    변수    연산자    제어문    출력
 *    ---    -------------    ---
 *     |           |           |
 *    배열        명령문     Application(Web)
 *    클래스
 *    
 *    클래스 구성요소
 *    1. 메소드
 *    2. 변수(맴버) => 프로그램 종료시까지 메모리 유지
 *    3. 생성자
 *    ---------------------------------------
 *    객체 지향 프로그램 : 유지보수 (데이터보호, 재사용, 수정, 추가)
 *    
 *    4. 비정상 종료를 방지하는 프로그램 : 견고한 예외처리
 *    --------------------------------------- 8장 기본
 *    5. 자바에서 지원하는 라이브러리 => 조립식
 *    ---------------------------------------------
 *    *** 오라클 연결 => 웹
 *    *** 브라우저 연결 
 *       ------------ => 통합 (Spring)
 */
// 년도를 입력받아서 윤년여부 확인
/*
 *   메소드안에서 출력 ==> void
 *   결과값을 받아서 출력 ==> boolean
 */
public class 메소드_1 {
	static void isLeapYear(int year) {
		if((year%4==0 && year%100!=0) || year%400==0)
			System.out.println(year + "년도는 윤년입니다");
		else
			System.out.println(year + "년도는 윤년이 아닙니다");
	}
	static boolean isLeapYear2(int year) {
		if((year%4==0 && year%100!=0) || year%400==0)
			return true;
		else
			return false;
	}
	static void process() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = Sc.nextInt();
		//isLeapYear(year);
		if(isLeapYear2(year))
			System.out.println(year + "년도는 윤년입니다");
		else
			System.out.println(year + "년도는 윤년이 아닙니다");			
	}
	public static void main(String[] args) {
		process();
	}
}
