import java.util.Arrays;

/*
 *     버블 정렬 : 인접한 데이터끼리 비교
 *     => 선택정렬 : 앞에서부터 정렬
 *     => 버블정렬 : 뒤에서부터 정렬
 */
public class 배열응용_알고리즘_3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===== 정렬전 ====");
		System.out.println(Arrays.toString(arr));
		System.out.println("===== 정렬후 ====");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
