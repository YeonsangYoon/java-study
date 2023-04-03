// 3의 배수의 합, 총 몇개인지 확인
public class 반복문_3 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				cnt++;
				sum+=i;
			}
		}
		System.out.println("3의 배수의 총합 : " + sum);
		System.out.println("3의 배수의 개수 : " + cnt);
		
		int cnt5 = 0, cnt7 = 0;
		int sum5 = 0, sum7 = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				cnt5++;
				sum5+=i;
			}
			if(i%7==0) {
				cnt7++;
				sum7+=i;
			}
		}
		System.out.println("5의 배수의 총합 : " + sum5);
		System.out.println("5의 배수의 개수 : " + cnt5);
		System.out.println("7의 배수의 총합 : " + sum7);
		System.out.println("7의 배수의 개수 : " + cnt7);
	}
}
