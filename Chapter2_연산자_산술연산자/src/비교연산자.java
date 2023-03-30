/*
 *    비교연산자 => 결과값 (boolean) => true/false
 *    == 같다
 *    != 같지않다
 *    <  작다(왼쪽이 기준)
 *    >  크다
 *    <= 작거나같다
 *    >= 크거나같다
 *    
 *    7 == 6 : false
 *    7 != 6 : true
 *    ------- byte, int, short, long, double, float, boolean, char 적용가능
 *    "a" == "a" => equals()로 비교
 *    'A' < 'B' => 65 < 66 : true
 *    10 > 5 : true
 *    10 <= 10 : true
 *    10 >= true : true
 */
public class 비교연산자 {
	public static void main(String[] arg) {
		int a = (int)(Math.random()*100) + 1;
		/* 우선순위
		 *            ------------
		 *                  1
		 *                       -----
		 *                         2
		 *        -----
		 *          3
		 *                             -----
		 *                               4
		 */      
		int b = (int)(Math.random()*100) + 1;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("a == b : " + (a==b));
		System.out.println("a != b : " + (a!=b));
		System.out.println("a != b : " + (a!=b));
		System.out.println("a < b : " + (a<b));
		System.out.println("a > b : " + (a>b));
		System.out.println("a >= b : " + (a>=b));
		System.out.println("a <= b : " + (a<=b));
	}
}
