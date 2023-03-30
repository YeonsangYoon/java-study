// <<, >>
/*
 *     10 << 2
 *     1010
 *     1010(0)(0)
 *     => 101000 => 40
 *     
 *     7 << 3
 *     111(0)(0)(0)
 *     => 56
 *     
 *     8 << 2
 *     1000(0)(0)
 *     => 32
 *     
 *     x << y ==> x * 2^y
 *     
 *     =========================================
 *     10 >> 2
 *     10(10) => 10 => 2
 *     
 *     15 >> 3
 *     1(111) => 1 => 1
 *     
 *     27 >> 3
 *     11(011) => 11 => 3
 *     
 *     x >> y ==> x / 2^y
 */
public class 쉬프트연산자 {
	public static void main(String[] arg) {
		System.out.println(10 << 2);
		System.out.println(7 << 3);
		System.out.println(8 << 2);
		
		System.out.println(10 >> 2);
		System.out.println(15 >> 3);
		System.out.println(27 >> 3);
	}
}
