import java.util.Arrays;

public class 배열_7 {
	public static void main(String[] args) {
		int[] arr1 = {10, 'A', 'B', 100, 15}; // int로 변환됨
		System.out.println(Arrays.toString(arr1));
		
		double[] arr2 = {10, 'A', 'b', 100, 15.7};
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = {'a', 66, 'C', 78, 97}; // int를 포함할 수 있다
		System.out.println(Arrays.toString(arr3));
		
		boolean[] arr4 = new boolean[5];
		System.out.println(Arrays.toString(arr4));
		
		byte[] arr5 = new byte[5];
		System.out.println(Arrays.toString(arr5));
	}
}
