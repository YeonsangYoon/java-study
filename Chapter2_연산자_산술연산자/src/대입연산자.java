/*
 *   대입연산자
 *   연산순서 : 좌 <- 우
 *   
 *   = 대입연산자
 *   --------------- 복합대입연산자
 *   +=
 *   -=
 *   *=
 *   /=
 *   %=
 *   <<=
 *   >>=
 *   &=
 *   |=
 *   ^=
 *   ---------------
 *   
 *   
 *   int a = 10;
 *   a+=10; ===> a = a + 10 ===> 20
 *   a+=1; a=a+1 a++ ++a 다 같음
 *   -------------------------------
 *   a+=20  a=a+20  
 *   a-=20  a=a-20  
 *   a*=20  a=a*20  
 *   a/=20  a=a/20  
 *   a%=20  a=a%20  
 *   a<<=20  a=a<<20  
 *   a>>=20  a=a>>20  
 *   
 */

public class 대입연산자 {
	public static void main(String[] arg) {
//		int a = 10;
//		a++;
//		a++;
//		a++;
//		System.out.println(a);
		
//		int a = 10;
//		a = a + 3;
//		System.out.println(a);
		
		int a = 10;
		a+=3;
		System.out.println(a);
		
	}

}
