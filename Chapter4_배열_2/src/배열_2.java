/*
 *     알파벳 10개 저장하는 공간을 만든다
 *     char c1 ~ c10;
 *     char[] alpha = new char[10]

 *     알파벳 100000개 저장하는 공간을 만든다
 *     char[] alpha = new char[100000]
 *     
 *     
 *     
 */
public class 배열_2 {
	public static void main(String[] args) {
		// 1.선언
		int[] arr = new int[5];
		// 2.초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 3.출력
		for(int i:arr) {
			System.out.println(i+" ");
		}
		// 4.제어
		
	}
}
