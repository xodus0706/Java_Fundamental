package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;
	public EchoServer(int port) {
		this.port = port;
	}
	public void run() {
		ServerSocket serverSocket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			//1. ServerSocket 인스턴스 생성한다.
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[서버 화면입니다.]");
		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다...");
			try {
				//2. 클라이언트 접속을 기다린다.
				//accept(): 클라이언트 접속을 기다리다 클라이언트가 접속하면 클라이언트와 통신할 수 있는 Socket객체를 생성해준다.
				Socket socket = serverSocket.accept();
				//4. 클라이언트 통신할 수 있는 Socket 객체가 생성된다.
				InetAddress i = socket.getInetAddress();
				System.out.println("클라이언트가 접속했습니다["+i.getHostAddress()+"]");
				
				//5. Socket을 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
				//6-2
				InputStream in = socket.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				//6-3
				OutputStream out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);

				while(true) { //읽고 쓰고를 반복함 그러나 다음 클라이언트를 받을 수 없음
				String readLine = br.readLine();
				System.out.println("클라이언트 메세지:" +readLine);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) {
		//재사용 목적이 있을 경우 이렇게 씀
		//EchoServer echoServer = new EchoServer(3000);
		//echoServer.run();
		new EchoServer(3000).run(); //echo server를 변수로 만들어서 메서드를 바로 호출 => 재사용하지 않아도 될때
	}
	
	

}
