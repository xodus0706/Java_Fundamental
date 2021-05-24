package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScan {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		for(int port = 1; port < 65536; port++) {
			try {
				//ServerSocket  클래스는 해당 서버의 port번호를 사용할 수 있으면
				//ServerSocket 인스턴스를 생성할 수 있고
				//그렇지 않으면 에외를 발생한다. 즉, 예외가 발생했다는 예기는 해당 port를 사용하고 있다는 것이다.
				serverSocket = new ServerSocket(port);
				
			} catch (IOException e) {
				System.err.println(port + "번호를 사용할 수 없습니다."); //번호가 사용중이기 때문이다.
			}
			
		}
	}

}
