
public class 문제07 {
	public static void main(String[] args) {
		int total = 0;
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10+1);
			total += arr[i];
		}
		
		for(int i:arr)
			System.out.print(i + " ");
		System.out.printf("\n평균 : %.2f", total/3.0);
	}
}
