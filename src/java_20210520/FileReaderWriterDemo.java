package java_20210520;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileDemo.java");
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileDemo-copy.java", true);//true를 쓸 경우 뒤에 이어쓰기를 하겠다는 의미(boolean append)
			/*
			int readChar = 0;
			//문자데이터는 모니터, 파일 모두 가능
			//read() : 한개의 문자를 읽는다.
			while ((readChar = fr.read()) != -1) {
				System.out.print((char)readChar); //모니터 출력
				//write() : 한개의 문자를 쓴다.
				fw.write(readChar); //파일 출력
			}
			*/
			int readCharCount = 0;
			char[] readChars = new char[1024*10];
			
			while((readCharCount = fr.read(readChars)) != -1) {
				System.out.println(readChars);
				fw.write(readChars, 0 , readCharCount); // readChars까지만 출력할 경우 원본과 다른 형태가 나온다.
				                                        //처음서부터 읽은 글자수를 입력해야 같은 형태가 나온다.
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(fr != null) fr.close();
					if(fw != null) fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

		
		
		
		
		
		
	}

}
