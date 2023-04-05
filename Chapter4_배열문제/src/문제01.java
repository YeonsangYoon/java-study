
public class 문제01 {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		while(i < 100) {
			if(i%3!=0) {
				i++;
				continue;
			}
			sum += i;
			i++;
		}
		System.out.println("1~100까지 3의 배수의 합:"+sum);
	}
}
