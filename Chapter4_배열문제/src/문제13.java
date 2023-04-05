
public class 문제13 {
	public static void main(String[] args) {
		int[] arr = {95, 75, 85, 100, 50};
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		for(int i:arr)
			System.out.print(i+" ");
	}
}
