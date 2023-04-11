/*
 *    클래스 구성요소
 *    ------------------------------
 *    변수 : 프로그램 종료시까지 유지하는 변수 (전역변수, 맴버변수)
 *          메소드안에서 사용되는 변수 (지역변수)
 *    ------------------------------
 *    생성자 : 변수 초기화, 클래스를 메모리에 저장시에 사용
 *    ------------------------------
 *    메소드 : 기능을 수행, 다른 클래스와 연결 (메세지)
 *    ------------------------------
 *    
 *		prinf의 선언문
 *		public PrintStream printf(String format, Object ... args) {
 *		    return format(format, args);
 *		}
 *
 *		- 가변 매개변수
 *		System.out.printf("%d\n", 10);
 *		System.out.printf("%d %d\n", 10, 20);
 *		System.out.printf("%d %d %d\n", 10, 20, 30);
 *		System.out.printf("%d %d %d %d\n", 10, 20, 30, 40);
 *
 *		데이터형 ... args => 가변 매개변수 (내부적으로 전달된 가변인자를 배열로 생성)
 *		만약 가변인자는 다른 매개변수 뒤인 마지막에 선언해야한다
 */
import java.util.Arrays;
import java.util.Scanner;

public class 메소드_1 {
//		사용자가 원하는 개수만큼 난수 발생(1~100)
//		사용자 => 개수 (매개변수)
//		리턴형 => 배열
	static int[] rand(int cnt) {
		int[] arr = new int[cnt];
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*100+1);
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("난수 개수 입력:");
		int cnt = Sc.nextInt();
		int[] arr = rand(cnt);
		
		System.out.println(Arrays.toString(arr));
	}
}
