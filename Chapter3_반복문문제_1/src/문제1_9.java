
public class 문제1_9 {
	public static void main(String[] args) {
		int sum2 = 0, sum3 = 0;
		for(int i=0;i<=12;i++) {
			if(i%2==0)
				sum2+=i;
			if(i%3==0)
				sum3+=i;
		}
		System.out.println("0~12까지 2의배수의 합:"+sum2);
		System.out.println("0~12까지 3의배수의 합:"+sum3);
	}
}
