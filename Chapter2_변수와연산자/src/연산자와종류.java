
/*
 * 피연산자 1개 : 단항연산자
 * a++
 * 피연산자 2개 : 이항연산자
 * 10 + 20
 * 피연산자 3개 : 삼항연산자
 * 
 * 1. 단항연산자
 *   = 증감연산자 (++, --) 1 증가/감소 => 반복문
 *     int a=10;
 *     a++;
 *      =>11
 *     int b=10;
 *     b--;
 *      => 9 
 *   = 부정연산자 (boolean만 사용이 가능)
 *     boolean b=true;
 *     !b
 *     false로 바뀜
 *   = 형변환연산자 (데이터형)
 *     (int)10.5 => 소수점 제거 10
 *     (char)65 => 'A'
 *     -------------------------- downcasting (강제형변환)
 *     (int)'A' => 65
 *     (double)10 => 10.0
 *     -------------------------- upcasting (자동형변환)
 *     
 *     10.5 + 10 = 20.5 ==> 데이터형이 동일할때 연산이 가능
 *           ----
 *           10.0 ==> 20.5
 *     
 *     'A' + 10
 *     ---
 *     65 + 10 ==> 75
 *     
 *     int이하의 데이터형은 연산시에 결과값이 int이다
 *     ------byte/short/char
 *     
 *     int + double => double
 *     char + long => long
 *     int + long => long
 *     long + double => double
 *     
 *     byte + char => int
 *   = 반전연산자(양수 -> 음수) 음수표현 ~
 * 
 *    1. 증감 연산자
 *      ++ : 1 증가
 *      -- : 1 감소
 *      
 *      형식 
 *       = 전치연산자 : 값이 참조되기 전에 증가/감소
 *         ++a
 *       = 후치 연산자 : 값이 참조되고 난후 증가/감소
 *         a++
 *         
 *       int a = 10;
 *       int b = ++a;
 *       
 *       ==> b = 11 (++a로 먼저 a가 증가한 다음 b에 대입)
 *       
 *       int a = 10;
 *       int b = a++;
 *       
 *       ==> b = 10 (먼저 b에 a를 대입한다음 a++로 증가)
 *    
 *    2. 부정 연산자
 *       !true => false
 *       !false => true
 *       
 *    3. 형변환연산자
 *    10.5+10.5 =>21.0
 *    (int)10.5 + (int)10.5 => 20
 *    ---------   ---------
 *    
 *    (int)(10.5 + 10.5) => 21
 *          -----------
 *          
 * 이항연산자
 *  - 산술연산자 : + , - , * , / , %
 *      => + , - , * : 데이터형
 *      => +
 *         산술연산 , 문자열 결합
 *      => /
 *         정수/정수 = 정수 ==> 10/3 = 3
 *         정수/실수 = 실수 ==> 10/3.0 = 3.3333
 *         0으로 나누면 오류 발생
 *      => %
 *         10%2 ==> 0
 *         11%2 ==> 1
 *         -----------
 *          5%2=1
 *          -5%2=-1
 *          5%-2=1
 *          -5%-2=-1
 *          ---------- 부호는 왼쪽편을 따라간다
 *    
 *        
 */
public class 연산자와종류 {
	public static void main(String[] args) {
//		byte b = 10;
//		byte c = 20;
//		byte d = b + c; => 오류 발생
//		int d = b + c;
//		System.out.println(d);
		
//		int a = 10;
//		int b = a++;
//		int c = ++a;
//		System.out.println("b=" + b);
//		System.out.println("c=" + c);
		
//		int a = 10;
//		int b = a++ + a++;
//		System.out.println("b=" + b);
		
//		boolean bCheck = false;
//		System.out.println(bCheck);
//		System.out.println(!bCheck);
		
//		int a = (int)(Math.random()*100)+1;
//		System.out.println(a);
		
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(10/(double)3);
		
	}
}
