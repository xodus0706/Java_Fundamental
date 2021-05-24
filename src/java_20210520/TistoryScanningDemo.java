package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TistoryScanningDemo {
	public static void main(String[] args) 
			throws IOException {
		URL url = new URL("https://m.blog.naver.com/PostView.nhn?blogId=telopere&logNo=120053568425&proxyReferer=&proxyReferer=https:%2F%2Fblog.naver.com%2Ftelopere%2F120053568425");
		InputStream in = url.openStream(); //외부네트워크가 연결
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		FileWriter fw = new FileWriter("C:\\Users\\user\\china.html");
		BufferedWriter bw = new BufferedWriter (fw);
		
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
	}

}
