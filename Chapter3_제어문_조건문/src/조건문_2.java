// 난수를 생성하고 3의 배수, 5의 배수, 7의 배수인지 확인
// 셋다 아닌 경우엔 배수가 아니다 출력
import java.util.Scanner;
public class 조건문_2 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		
		if(num%3==0)
			System.out.println(num + "은(는) 3의 배수입니다.");
		if(num%5==0)
			System.out.println(num + "은(는) 5의 배수입니다.");
		if(num%7==0)
			System.out.println(num + "은(는) 7의 배수입니다.");
		if(num%3!=0 && num%5!=0 && num%7!=0)
			System.out.println(num + "은(는) 배수가 아닙니다.");
	}
}
