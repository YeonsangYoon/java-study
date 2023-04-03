/*
 *    자바에서 지원하는 반복문
 *    ------------------
 *    for : 반복 횟수가 지정된 경우에 주로 사용
 *     = 일반 for
 *     = for-each : 출력용(웹에서 가장 많이 등장 : 향상된 for) *** 배열,컬렉션
 *    while : 반복 횟수를 모르는 경우(선조건)
 *    do-while : 반복 횟수를 모르는 경우(후조건) => 무조건 1번 이상은 수행
 *    
 *    => 유사한 내용을 여러번 출력을 할때 주로 사용
 *    => 형식)
 *       for(초기값;조건식;증감식)
 *       {
 *          반복 실행문장
 *       }
 *       for(int i=1;i<=10;i++) => 10번 수행
 *       {
 *       
 *       }
 *       
 *       초기값 : 시작점 ==> 한번만 수행
 *       조건식 : 수행을 중단할때(종료점)
 *       증감식 : 초기값 ~ 조건식 => false 일때까지 수행
 *       ----- 감소도 가능
 *       for(int i=10;i>=1;i--)
 *       여러개 증가/감소도 가능하다
 *       for(int i=1;i<=10;i+=2)
 *       
 *       실행 순서(****프로그램에서 가장 많이 사용되는 제어문 : for if)
 *       
 *       => for문은 한문장만 수행이 가능
 *           여러문장 사용시에는 {}를 이용해서 처리한다
 *           
 *                1       2      4
 *       => for(초기값 ; 조건식 ; 증감식)
 *          {          ------
 *                     false면 종료
 *                  3
 *             반복 실행 문장
 *          }
 *          
 *          초기값 => 조건식에 대입 => false => 종료
 *                             => true => 반복 문장 수행 => 초기값증가
 */
public class 반복문_1 {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");

		// 반복문 이용
		for(int i=1;i<=10;i++) {
			System.out.println("Hello Java"+i);
		}
	}
}
