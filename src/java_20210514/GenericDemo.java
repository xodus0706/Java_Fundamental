package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList <String>list = new ArrayList<String>();
		list.add("1");
		list.add("2");;
		list.add("3");
	//문자열 들어가는게 확실하므로 밑에는 캐스팅한다.	
		for (int i = 0; i<list.size(); i++) {
		String value = list.get(i);
		System.out.println(value);
		}
		
		for(String value : list) {
			System.out.println(value);
		
		}
	}
}