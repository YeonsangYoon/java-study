//1~100까지의 합
public class 반복문_2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합: " + sum);
		
		sum = 0;
		for(int i=2;i<=100;i+=2) {
			sum += i;
		}
		System.out.println("1~100중 짝수의 합: " + sum);
	}
}
