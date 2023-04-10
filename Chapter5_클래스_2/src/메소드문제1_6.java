public class 메소드문제1_6 {
	//	1. 1~10까지 출력하는 메소드 구현
	static void printOneToTen() {
		for(int i=1;i<=10;i++)
			System.out.println(i + " ");
	}
	
	
	//	2. 1~10까지 합을 구하는 메소드 구현
	static int getSumOneToTen() {
		int sum = 0;
		for(int i=1;i<=10;i++)
			sum+=i;
		return sum;
	}
	
	
	//	3. 1~n까지 합을 구하는 메소드 구현
	static int getSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++)
			sum+=i;
		return sum;
	}
	
	//	4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	static String div(int a, int b) {
		if(b==0)
			return "0으로 나눌 수 없습니다";
		else
			return a + "/" + b + "=" + (double)a/b;
	}
	
	//	5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	static String swapAlpha(String s) {
		return s.toUpperCase();
	}
	
	//	6. 문자열을 거꾸로 출력하는 메소드 구현
	static String reverseString(String s) {
		String ret = "";
		for(int i=s.length()-1;i>=0;i--)
			ret += s.charAt(i);
		return ret;
	}
	
	public static void main(String[] args) {
		
	}
}
