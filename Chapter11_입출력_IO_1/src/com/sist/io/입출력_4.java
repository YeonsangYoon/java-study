package com.sist.io;
// BufferedReader/BufferedWriter => 필터스트림
import java.io.*;
public class 입출력_4 {
	public static void main(String[] args) throws IOException{
		FileWriter out = new FileWriter("c:\\java_datas\\movie_1.txt");
		// 자동으로 지정된 파일을 생성, 이미 존재하는 경우엔 덮어쓴다
		FileReader in = new FileReader("c:\\javaDev\\movie.txt");
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		while(true) {
			String data = br.readLine();
			if(data==null)
				break;
			bw.write(data+"\n");
		}
		br.close();
		bw.close();
	}
}
