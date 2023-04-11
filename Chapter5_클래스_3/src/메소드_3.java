import java.util.Arrays;

public class 메소드_3 {
	static int[] rand() {
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*100)+1;
		return arr;
	}
	static void rand2(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		int[] arr1 = rand();
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = new int[5];
		rand2(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
