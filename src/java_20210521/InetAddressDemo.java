package java_20210521;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress i = InetAddress.getLocalHost();
		System.out.printf("호스트 이름 : %s%n", i.getHostName());
		System.out.printf("IP : %s%n", i.getHostName());
		
		InetAddress i2 = InetAddress.getByName("naver.com"); //해당 도메인을 치며 IP가 나온다. 
		System.out.printf("호스트 이름 : %s%n", i2.getHostName());
		System.out.printf("IP : %s%n", i2.getHostName());
	
		
	}

}
