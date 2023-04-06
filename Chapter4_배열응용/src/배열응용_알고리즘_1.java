import java.util.Arrays;

/*
 *     정렬 : ASC(올림차순) / DESC(내림차순)
 *     --------------------------------
 *     선택정렬(select sort)
 *     =>  책 잠고
 *      
 */
public class 배열응용_알고리즘_1 {
	public static void main(String[] args) {
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("========== 정렬전 ===========");
		System.out.println(Arrays.toString(arr));
		System.out.println("========== 정렬중 ===========");
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) { 
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println("========== 정렬후 ===========");
		System.out.println(Arrays.toString(arr));
	}
}
