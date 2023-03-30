import java.util.Scanner;

public class 삼항연산자_2 {
	public static void main(String[] args) {
		int com = (int)(Math.random()*3);
		Scanner Sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 입력 : ");
		int user = Sc.nextInt();
		Sc.close();
		
		System.out.println("========== 확인 ============");
		System.out.print(com==0?"컴퓨터 : 가위\n":"");
		System.out.print(com==1?"컴퓨터 : 바위\n":"");
		System.out.print(com==2?"컴퓨터 : 보\n":"");

		System.out.print(user==0?"플레이어 : 가위\n":"");
		System.out.print(user==1?"플레이어 : 바위\n":"");
		System.out.print(user==2?"플레이어 : 보\n":"");
		
		System.out.println("========== 결과 ============");
		System.out.print((user-com==1 || user-com == -2)?"플레이어 승리!\n":"");
		System.out.print((user-com==-1 || user-com == 2)?"컴퓨터 승리!\n":"");
		System.out.print((user-com==0)?"비김!\n":"");
		
	}
}
