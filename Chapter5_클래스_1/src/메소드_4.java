/*
 *   1) 2단 ~ 9단까지 구구단을 출력
 *      static void gugudan()
 *      
 *   2) id, pwd를 받아서 로그인 가능하면 true, 아니면 false
 *      static boolean isLogIn(String id, string pwd)
 *      
 *   3) 검색어를 입력받아서 검색된 노래명들을 출력
 *      static void searchSong(String fd)
 *      
 *   4) 5정수를 넘겨주고 정렬된 정수를 받는다
 *      static int[] sort(int a, int b, int c, int d, int e)
 */
// 6개의 난수를 발생해서 => 전송을 받은 다음 => 총합, 평균
import java.util.Arrays;
public class 메소드_4 {
	// 6개 난수 발생
	static int[] rand() {
		int[] arr = new int[6];
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*100+1);
		return arr;
	}
	static int getMax(int[] arr) {
		int max = 0;
		for(int i:arr)
			if(i>max)
				max=i;
		return max;
	}
	static int getMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i:arr)
			if(i<min)
				min=i;
		return min;
	}
	static void process() {
		int[] arr = rand();
		int total = 0;
		for(int i:arr)
			total+=i;
		System.out.println(Arrays.toString(arr));
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n", (double)total/arr.length);
		System.out.println("최고점:"+getMax(arr));
		System.out.println("최저점:"+getMin(arr));
	}
	public static void main(String[] args) {
		process();
	}
}
