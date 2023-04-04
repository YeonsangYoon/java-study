
public class 문제02 {
	public static void main(String[] args) {
		int sum = 0, cnt = 0;
		for(int i=100;i<1000;i++) {
			if(i%4!=0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println("갯수:"+cnt);
		System.out.println("합:"+sum);
	}
}
