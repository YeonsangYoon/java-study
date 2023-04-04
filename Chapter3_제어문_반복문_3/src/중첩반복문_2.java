/*
 *    ★
 *    ★★
 *    ★★★
 *    ★★★★
 *    
 *    ★★★★
 *    ★★★
 *    ★★
 *    ★
 *    
 *    ===> 정렬
 *    ===> 빈도구하기
 *    ===> 등수구하기
 *    ===> 마름모 / 나비 / 모래시계
 */
public class 중첩반복문_2 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		for(int i=1;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		char c = 'A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		
		System.out.println("===============================");

		for(int i=1;i<=4;i++) {
			c = 'A';
			for(int j=1;j<=i;j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		
		System.out.println("===============================");

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==j)
					System.out.print("#");
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}
}
