package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) throws IOException {
		//URL url = new URL("http://news.khan.co.kr/kh_news/khan_art_view.html?artid=202105202339001&code=940100&nv=stand&utm_source=naver&utm_medium=newsstand&utm_campaign=row1_8");
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=001&aid=0012407227");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort(); // 포트가 없으면 -1을 반환함
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();

		System.out.println("protocol: " + protocol);
		System.out.println("host: " + host);
		System.out.println("port: " + port);
		System.out.println("path: " + path);
		System.out.println("query: " + query);
		System.out.println("ref: " + ref);
		
		/*
		InputStream in = url.openStream(); //source : html
		int readByteCount = 0;
		byte[] readbytes = new byte[1024*8];
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Downloads\\test.jpg");
		while((readByteCount =  in.read(readbytes)) != -1){
			fos.write(readbytes, 0 , readByteCount);
		}
		fos.close();
		*/
		
		InputStream in = url.openStream(); //source :  html
		InputStreamReader isr = new InputStreamReader(in, "euc-kr");
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		
	}

}
