package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class EchoServerThread implements Runnable {
	private Socket socket;

	public EchoServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() { // run메서드 overriding
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		try {
			// 4. 클라이언트 통신할 수 있는 Socket 객체가 생성된다.
			InetAddress i = socket.getInetAddress();
			System.out.println("클라이언트가 접속했습니다[" + i.getHostAddress() + "]");
			// 5. Socket을 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
			// 6-2
			InputStream in;
			in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			// 6-3
			OutputStream out = socket.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);

			while (true) { // 읽고 쓰고를 반복함 그러나 다음 클라이언트를 받을 수 없음
				String readLine = br.readLine();
				System.out.println("클라이언트 메세지:" + readLine);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			System.err.println("클라이언트가 비정상적으로 종료하셨습니다.");
		}
	}
}
