// 1~100까지 반복문을 수행
// 11, 22, 33, 44, 55... 
// 두개는 같은 정수입니다. / 두개는 다른 정수입니다.
public class 반복문_7 {
	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			if(i%11==0)
				System.out.println(i+" : 같은 정수입니다");
			else
				System.out.println(i+" : 다른 정수입니다");
		}
	}
}
