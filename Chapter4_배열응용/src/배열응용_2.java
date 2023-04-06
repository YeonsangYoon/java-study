import java.util.Arrays;

// 정수 10개 저장 공간 => 임의로 초기화
public class 배열응용_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		int min = arr[1];
		for(int i:arr) {
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		int index1=0, index2=0;
		for(int i=0;i<arr.length;i++) {
			if(max == arr[i])
				index1=i;
			if(min == arr[i])
				index2=i;
		}
		System.out.println("최대값 위치:" + (index1+1));
		System.out.println("최소값 위치:" + (index2+1));
	}
}
