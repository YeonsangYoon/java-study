
public class 문자열_6 {
	public static void main(String[] args) {
		String menu = "원조김밥 2,500원쌀떡볶이 3,500원찹쌀순대 3,500원라면 3,500원쫄면 5,500원";
		
		String[] menus = menu.split("원");
		for(String s : menus) {
			System.out.println(s);
		}
	}
}
