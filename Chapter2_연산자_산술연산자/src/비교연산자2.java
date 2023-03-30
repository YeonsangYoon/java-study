
public class 비교연산자2 {
	public static void main(String[] args) {
		
		char c1 = (char)(Math.random()*26+65);
		char c2 = (char)(Math.random()*26+65);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("== : " + (c1==c2));
		System.out.println("!= : " + (c1!=c2));
		System.out.println("< : " + (c1<c2));
		System.out.println("> : " + (c1>c2));
		System.out.println("<= : " + (c1<=c2));
		System.out.println(">= : " + (c1>=c2));
	}
}
