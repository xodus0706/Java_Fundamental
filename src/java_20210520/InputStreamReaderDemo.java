package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		/*
		InputStream in = System.in; // source가 키보디인 경우
		byte[] b = new byte[100];
		
		int readByteCount = 0; //키보드와 연결되었기 때문에 enter를 쳐야 연결
		System.out.print("입력하세요>");

		while ((readByteCount = in.read(b)) != -1) {
			String message = new String (b,0,readByteCount);
			if(message != null && message.trim().equals("quit")) break; //trim() 공백제거 + \r\n도 제거
			System.out.print(message);
			System.out.print("입력하세요>");
		}
		*/
		
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		FileWriter fw = new FileWriter("C:\\Users\\user\\messgae.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readLine = null;
		System.out.print("입력하세요>");
		while((readLine = br.readLine()) != null) {
			if(readLine != null && readLine.equals("quit"))break;
			System.out.println(readLine); //readLine에는 \r\n이 없으므로 println을 쓴다.
			bw.write(readLine);
			bw.newLine();
			System.out.print("입력하세요>");
		}
		bw.flush();
		
		
		
		
		
		
		
		
		
		
	}

}

