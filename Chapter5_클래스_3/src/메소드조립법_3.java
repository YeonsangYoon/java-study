/* 숫자야구 게임
 *  1. 난수 발생
 *  2. 사용자 입력
 *  3. 비교
 *  4. 힌트 생성
 *  5. 종료
 */
import java.util.Arrays;
import java.util.Scanner;
public class 메소드조립법_3 {
	static int[] input() {
		Scanner Sc = new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수 입력:");
			int num = Sc.nextInt();
			
			if(num < 100 || num > 999) {
				System.out.println("세자리 정수를 입력해주세요");
				continue;
			}
			int a = num/100;
			int b = (num%100)/10;
			int c = num%10;
			
			if(a == b || b == c || c == a) {
				System.out.println("중복된 수는 입력할 수 없습니다");
				continue;
			}
			else if(a == 0 || b == 0 || c == 0) {
				System.out.println("0을 입력할 수 없습니다");
				continue;
			}
			
			int[] ret = {a, b, c};
			return ret;
		}
	}
	
	static int[] rand() {
		int[] ret = new int[3];
		boolean[] hash = new boolean[10];
		for(int i=0;i<ret.length;i++) {
			ret[i]=(int)(Math.random()*9+1);
			if(hash[ret[i]])
				i--;
			else
				hash[ret[i]]=true;
		}
		return ret;
	}
	static String compare(int[] com, int[] user) {
		int sCnt = 0;
		int bCnt = 0;
		for(int i=0;i<com.length;i++) {
			for(int j=0;j<com.length;j++) {
				if(com[i]==user[j]) {
					if(i==j)
						sCnt++;
					else
						bCnt++;
				}
			}
		}
		String ret=sCnt + "S-" + bCnt + "B";
		return ret;
	}
	static void process() {
		System.out.println("============ 게임 시작 =============");
		int[] com = rand();
//		System.out.println(Arrays.toString(com));
		int cnt = 0;
		while(true) {
			int[] user = input();
			String result = compare(com, user);
			System.out.printf("#%d %s\n", ++cnt, result);
			
			if(result.equals("3S-0B"))
				break;	
		}
		System.out.println("============ 경기 결과 =============");
		System.out.println("컴퓨터 숫자 : " + Arrays.toString(com));
		System.out.println("시도 횟수 : " + cnt);
	}
	public static void main(String[] args) {
		while(true) {
			process();
			System.out.println("게임을 종료하시겠습니까?(y/n)");
			Scanner Sc = new Scanner(System.in);
			char c = Sc.next().charAt(0);
			if(c == 'y')
				break;
		}
	}
}
