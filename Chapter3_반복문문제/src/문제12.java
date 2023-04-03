
public class 문제12 {
	public static void main(String[] args) {
		for(int i=2;i<=30;i+=2) {
			System.out.printf("%2d\t", i);
			if(i%6==0)
				System.out.println();
		}
	}
}
