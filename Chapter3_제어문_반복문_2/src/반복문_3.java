// 3의 배수, 5의 배수, 7의 배수의 합 => 개수 확인
public class 반복문_3 {
	public static void main(String[] args) {
		int sum3=0, sum5=0, sum7=0;
		int cnt3=0, cnt5=0, cnt7=0;
		
		int i=1;
		while(i<=100) {
			if(i%3==0) {
				sum3+=i;
				cnt3++;
			}
			if(i%5==0) {
				sum5+=i;
				cnt5++;
			}
			if(i%7==0) {
				sum7+=i;
				cnt7++;
			}
			i++;
		}
		
		
		System.out.println("1~100 사이의 3의 배수합: " + sum3 + ", 개수:" + cnt3);
		System.out.println("1~100 사이의 5의 배수합: " + sum5 + ", 개수:" + cnt5);
		System.out.println("1~100 사이의 7의 배수합: " + sum7 + ", 개수:" + cnt7);
		
		int max = cnt3, min = cnt3;
		if(max < cnt5)
			max = cnt5;
		if(max < cnt7)
			max = cnt7;
		System.out.println("가장 많은 개수는 " + max);
		if(min > cnt5)
			min = cnt5;
		if(min > cnt7)
			min = cnt7;
		System.out.println("가장 적은 개수는 " + min);
		
		
	}
}
