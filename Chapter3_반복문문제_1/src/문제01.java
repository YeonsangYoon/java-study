
public class 문제01 {
	public static void main(String[] args) {
		int sum = 0, cnt = 0;
		for(int i=100;i<1000;i++) {
			if(i%7==0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println("7의 배수 갯수:"+cnt);
		System.out.println("7의 배수 합:"+sum);
	}
}
