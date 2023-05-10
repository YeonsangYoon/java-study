package com.sist.server;
// port : 10000
/*
 *    프로그램 제작
 *    1) 서버 동작
 *      ServerSocket ss = new ServerSocket(port번호)
 *      => bind() : 개통(ip, port)
 *      => listen() : 클라이언트 연결시까지 대기
 *    2) 클라이언트가 접속시 처리
 *      => ss.accept()
 *         ----------- 클라이언트가 서버 연결 호출 (연결시마다 호출)
 *         ----------- 진동/음악...
 *         => 클라이언트 정보 (ip, port)
 *                         --------- Socket
 *    3) 클라이언트마다 따로 통신이 가능하게 넘겨준다
 *       ---------------------------------- 쓰레드
 *    
 */
import java.util.*;

import com.sist.common.Function;

import java.io.*;
import java.net.*;

public class Server implements Runnable{
	/*
	 *    Vector : 동기화
	 *    ArrayList : 비동기화
	 */
	private Vector<Client> waitVc = new Vector<Client>();
	private ServerSocket ss;
	private final int PORT = 10000;
	public Server() {
		try {
			ss = new ServerSocket(PORT);
			System.out.println("Server Start...");
		}
		catch(Exception e) {
			e.printStackTrace();                                                           
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Socket s=ss.accept();
				// 접속시마다 발신자 정보를 확인
				Client client = new Client(s);
				client.start();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	class Client extends Thread{
		String id, name, sex;
		// 클라이언트에서 보낸값 읽기
		BufferedReader in;
		// 클라이언트로 결과값 전송
		OutputStream out;
		// 클라이언트와 연결 ==> 연결 기기
		Socket s;
		
		// 연결 시도
		public Client(Socket s) {
			try {
				this.s=s;
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			}
			catch(Exception e) {
				
			}
		}
		// synchronized : 동기화
		// 디폴트는 비동기화
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public synchronized void messageAll(String msg)	{
			try {
				for(Client c : waitVc) {
					c.messageTo(msg);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public void run() {
			try {
				while(true) {
					String msg = in.readLine();
					StringTokenizer st = new StringTokenizer(msg, "|");
					
					int protocol = Integer.parseInt(st.nextToken());
					switch(protocol) {
					case Function.LOGIN:{
						id=st.nextToken();
						name=st.nextToken();
						sex=st.nextToken();
						messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
						waitVc.add(this);
						messageTo(Function.MYLOG+"|"+name+"|"+id);
						
						for(Client user : waitVc) {
							messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex);
						}
						break;
					}
					case Function.CHAT:{
						String strMsg=st.nextToken();
						String color = st.nextToken();
						messageAll(Function.CHAT+"|["+name+"]"+strMsg+"|"+color);
						
						break;
					}
					case Function.INFO:{
						String youId = st.nextToken();
						for(Client user:waitVc) {
							if(youId.equals(user.id)) {
								messageTo(Function.INFO+"|"+user.id+"|"+user.name+"|"+user.sex);
								break;
							}
						}
						break;
					}
					case Function.MSGSEND:{
						String youid = st.nextToken();
						String strMsg = st.nextToken();
						for(Client user:waitVc) {
							if(youid.equals(user.id)) {
								user.messageTo(Function.MSGSEND+"|"+id+"|"+strMsg);
								break;
							}
						}
					}
					}
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				waitVc.remove(this);
			}
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		new Thread(server).start(); // Server안에 있는 run을 호출
		
	}
}
