package com.sist.io;
import java.io.*;
import java.net.*;
public class 입출력_5 {
	public static void main(String[] args) throws Exception{
		URL url = new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		
		if(con!=null) {
			// 브라우저에서 1byte씩 전속
			// 1byte => 2byte로 변환
			// InputStreamReader
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			while(true) {
				String data = in.readLine();
				if(data==null)
					break;
				System.out.println(data);
			}
		}
	}
}
