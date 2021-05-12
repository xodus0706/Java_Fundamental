package java_20210512;

public class StringDemo {
	
	public static void main(String[] args) {
		String str1 = new String ("hello");
		String str2 = new String("hello");
		String str3 = "test";
		String str4 = "test";
		
		System.out.println(str1 == str2);
		//문자열 비교는 equals로 해야함
		System.out.println(str1.equals(str2));
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));

	
		String str = new String ("abc");
		//.concat()은 문자열을 더해주는 것
		str = str.concat("123");
		System.out.println(str);
	}

}
