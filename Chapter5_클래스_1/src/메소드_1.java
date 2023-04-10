/*
 *    메소드
 *     1) 구조화된 프로그램 (문장을 기능별로 나눠서 작업)
 *     2) 반복 제거 ==> Spring(AOP)
 *     3) 메소드는 한개의 기능만 수행
 *     -----------------------------------------
 *     리턴형 : 처리후 결과값 (한개만 설정이 가능)
 *     매개변수 : 사용자가 요청하는 값 (여러개 보낼 수 있다)
 *              => 3개이상이면 [], class
 *     형식)
 *         리턴형 메소드명(매개변수)
 *         ---- ------- 한 자바파일안에 모든 메소드명이 달라야 한다?(X)
 *                      같은 메소드명이 있을 수 있다(매개변수가 다르면 된다)
 *         요청 결과값 (한개만) ==> 여러개 : int[], class
 *         
 *         ** 사용자가 요청한 값(매개변수)을 받아서 처리후에 결과값을 보내주거나 화면에 출력
 *         
 *         정수 두개를 보내고 더한값을 받는다
 *           => return a+b
 *           => System.out.println("a+b=
 */
import java.util.Scanner;
public class 메소드_1 {
	static void gugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n", dan, i, dan*i);
		}
	}
	static void process() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("단을 입력:");
		int dan = Sc.nextInt();
		
		gugudan(dan);
	}
	public static void main(String[] args) {
		process();
	}
}
