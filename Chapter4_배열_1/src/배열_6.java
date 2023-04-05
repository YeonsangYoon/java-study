import java.util.Arrays;

public class 배열_6 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		// 1. 배열의 크기를 출력
		System.out.println("배열의 크기:"+arr.length);
		// 2. 3번째값을 300
		arr[2] = 300;
		System.out.println(Arrays.toString(arr));
		// 3. 5번째를 출력
		System.out.println("5번째값:" + arr[4]);
		
	}
}
