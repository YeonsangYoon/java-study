import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class 선택조건문_4 {
	public static void main(String[] args) {
		try {
			Scanner Sc = new Scanner(System.in);
			System.out.print("검색어 입력: ");
			String fd = Sc.next();
			
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("tr.list a.title");
			Elements singer = doc.select("tr.list a.title");
			for(int i=0;i<title.size();i++) {
				String s = title.get(i).text();
				if(fd.contains(s)) {					
					System.out.println(title.get(i).text()+" " + singer.get(i).text());
				}
			}
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
					                  + "http://youtube.com/embed/ziMvGgq8FQc");
			
		}
		catch(Exception ex) {}
	}
}
