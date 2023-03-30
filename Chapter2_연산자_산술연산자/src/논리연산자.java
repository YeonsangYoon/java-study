/* && ||
 * 
 *    (조건) && (조건)
 *    -----    -----
 *      |        |
 *      ----------
 *          |
 *         결과
 *         
 *     && => 범위나 기간에 포함
 *    ---------------------------
 *     true   true   => true
 *    ---------------------------
 *     true   false  => false
 *    ---------------------------
 *     false  true   => false
 *    ---------------------------
 *     false  false  => false
 *    ---------------------------
 *    
 *     || => 범위나 기간을 벗어난 경우
 *    ---------------------------
 *     true   true   => true
 *    ---------------------------
 *     true   false  => true
 *    ---------------------------
 *     false  true   => true
 *    ---------------------------
 *     false  false  => false
 *    ---------------------------
 *    
 *    => 효율적 연산 (뒷부분을 수행하지 않는 경우)
 *     () && ()
 *    false  --
 *     () || ()
 *    true   -- 
 *    
 *    int a = 10;
 *    int b = 9;
 *    
 *    (a < b) && (++b==a) : false
 *    -------
 *     false
 */  
public class 논리연산자 {
	public static void main(String[] arg) {
//		int a = 10;
//		int b = 9;
//		 
//		System.out.println((a < b) && (++b==a));
//		System.out.println(b);
//		
//		System.out.println((a < b) || (++b==a));
//		System.out.println(b);
		
//		int a = 100;
//		int b = 99;
//		
//		System.out.println((a>b) && (b==a));
//		System.out.println((a>b) || (b==a));
//		
//		char c = (char)((Math.random()*26)+65);
//		boolean bCheck = c >='A' && c <='Z';
//		System.out.println("c : " + c);
//		System.out.println(bCheck);
		
//		char sex = 'M';
//		int score = 87;
//		boolean bCheck = (sex=='M' && score>=80);
//		System.out.println(bCheck);
//		
//		int a = 10;
//		boolean bCheck = a%2==0 && a>2;
//		System.out.println(bCheck);
		
		int year = 2024;
		boolean bCheck = ((year%4==0) && year%100!=0) || (year%400==0);
		System.out.println(bCheck);
	}
}
