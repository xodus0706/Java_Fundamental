package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutputStreamDemo {
	public static void main(String[] args) {
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	
	try {
		fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
		fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy.zip");
		
		/*
		//1. FileInputStream과 FileOutputstream을 이용하여 1바이트 읽어서 1바이트 출력한 예제이고
		//그 결과 경과시간은 38864(밀리세컨드)초이다. (11,756kb 파일)

		int readByte = 0;
		long start = System.currentTimeMillis();
		while((readByte = fis.read()) != -1) {
			fos.write(readByte);
		}
		long end = System.currentTimeMillis();
		System.out.printf("경과시간 : %d초 %n", (end-start));
		*/

		//2. BufferedInputStream과 BufferedOutputStream을 이용하여 1바이트를 읽어서 1바이트 출력한 예제이고
		//경과시간은 322(밀리세컨드)초이다.
		//BufferedOutputStream의 버퍼(byte[]) 공간에 가득 차 있으면 출력한다.
		//만약 다 채워지지 않으면 출력하지 않는다.
		//이런 경우 flush() 메서드를 호출하여 모두 출력해줘야 한다.
		
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);
		int readByte = 0;
		long start = System.currentTimeMillis();
		while((readByte = bis.read()) != -1) {
			bos.write(readByte);
		}
		bos.flush();//마지막까지 다 출력해주는 메서드
		long end = System.currentTimeMillis();
		System.out.printf("경과시간 : %d초 %n", (end-start));
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append("select");
		sb.append("from");
		sb.append("where");
		sb.append("having");
		sb.append("order by");
		sb.append("limit");
		*/
		
		/*
		//3.readByteCount
		//경과시간은 26(밀리세컨드)초이다.
		//이 방법이 가장 짧으므로 이 방법을 사용하는 것이 가장 적합하다.
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*10];
		long start = System.currentTimeMillis();
		while((readByteCount = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteCount);
		}
		long end = System.currentTimeMillis();
		System.out.printf("경과시간 : %d초 %n", (end-start));
		*/
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			if(fis != null) fis.close();
			if(bis != null) bis.close();
			if(fos != null) fos.close();
			if(bos != null) bos.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	
	}
	}

