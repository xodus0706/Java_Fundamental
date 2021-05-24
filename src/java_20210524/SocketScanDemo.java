package java_20210524;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo {
	public static void main(String[] args) {
		Socket socket = null;
		for ( int port = 0; port <= 2024; port++) {
			try {
				//Socket 객체가 생성되었다는 의미는 host, port로 통신할 수 있다는 것이고,
			    //이는 해당 host에 port 번호를 사용하고 있다는 것이다.
				socket = new Socket("127.0.0.1", port);
				System.out.println(port+"번호를 사용하고 있습니다.");
			} catch (UnknownHostException e) {
				System.out.println("호스트가 존재하지 않는다.");
			} catch (IOException e) {
				System.out.println(port+"번호를 사용하지 않고 있습니다.");
			}
		}	
	
		
		
		
		
		
		
		
		
		
		
	}
}
