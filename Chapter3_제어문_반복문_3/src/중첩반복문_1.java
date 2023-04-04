// 2차 for
/*
 *    중첩
 *        if()
 *        {
 *           if()
 *           {
 *           }
 *        }
 *        
 *        switch()
 *        {
 *        case 값:
 *           switch()
 *           {
 *           }
 *        }
 *        
 *        for(4)   ==========> 줄수
 *        {
 *           for(5) ==========> 출력 개수
 *           {
 *           }
 *        }
 *        
 *         1  2  3  4  5
 *         6  7  8  9 10
 *        11 12 13 14 15
 *        16 17 18 19 20
 */
public class 중첩반복문_1 {
	public static void main(String[] args) {
//		char c= 'A';
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print(c++ + " ");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.printf("i=%d, j=%d\n", i, j);
//			}
//		}
		
		System.out.println("=========== 구구단 ============");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}
}
