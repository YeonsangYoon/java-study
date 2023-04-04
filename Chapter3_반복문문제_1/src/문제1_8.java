
public class 문제1_8 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=4;i<=4462;i+=2) {
			sum+=i;
		}
		System.out.println("3이상 4462이하에서 짝수의 합:"+sum);
	}
}
