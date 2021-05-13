package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		char [] c = {'h', 'e', 'l','l','o'};
		String str = new String(c); //new String(c,0,2) => 처음부터 두개뽑아라
		                            //new String(c,2,2) => 2번방부터 두개뽑아라
		//문자열중에 특정 문자 하나만 반환하는 메서드
		//Index 0부터 시작
		char c1 = str.charAt(1); 
		System.out.println(c1); //문자열에서 1번방을 출력해라
		
		//문자열 연결하는 메서드
		str = str.concat("123"); 
		System.out.println(str);
		
		//endsWith(String msg) => msg문자열로 끝나면 true, 그렇지 않으면 false
		str = new String("abc.zip");
		if (str.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else if (str.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		
		//startsWith(String msg) => msg문자열로 시작하면 true, 그렇지 않으면 false
		String url = new String("https//www.naver.com");
		String path = new String("/news/board.do?id=123&cat=1");
		if (url.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if (path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//equals() => 문자열 비교
		//equalsIgnoreCase => 대소문자 구분하지 않고 비교
		//.trim() => 앞뒤 공백제거
		//분명 문자가 같은데 false가 나온다면 두 length비교
		String m1 = new String(" hello ").trim();
		String m2 = new String("hello");
		if (m1.equals(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//getBytes() => 문자열을 byte배열로 변환하는 메서드
		String m3 = new String("안녕하세요");
		byte [] b = m3.getBytes();
		System.out.println(b.length);

		//indexOf => 앞쪽 추출하고자 하는 부호 또는 글자의 앞에서부터 수 
		String m4 = new String("111111-1111118");
		int index = m4.indexOf("-");
		System.out.println(index);
	
		//lastIndcexOf => 뒤쪽 추출하고자 하는 부호 또는 글자의 앞에서부터의 수
		String m5 = new String("a.b.c.zip");
		int lastIndexOf = m5.lastIndexOf(".");
		System.out.println(lastIndexOf);
	
		//substring() => 추출
		System.out.println(m4.substring(0, m4.indexOf("-")));
		System.out.println(m4.substring(m4.indexOf("-")+1));
		
		System.out.println(m5.substring(0, m5.lastIndexOf(".")));
		System.out.println(m5.substring(m5.lastIndexOf(".")+1));
	
		String m6 = new String("010-3024-9999");
		System.out.println(m6.substring(0, m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1, m6.lastIndexOf("-")));
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
	
		//Integer.parseInt => 문자열을 primitive type(int)으로 바꾼디.
		//Double.parsedouble => 문자열을 double로 바꾼다.
		int a1 = Integer.parseInt(m4.substring(0,1));
		System.out.println(a1);
		String m7 = 123 + "";
		
		//String.valueOf => primitive type을 문자열로 바꾼다.
		String m8 = String.valueOf(123);
		System.out.println(m8);
		
		//repalceAll(A,B) => A를 B로 만들겠다.
		String m9 = m6.replaceAll("-","*");
		System.out.println(m9);
		
		//toLowerCase() => 모두 소문자로 바꾼다.
		//toUpperrCase() => 모두 대문자로 바꾼다.
		String m10 = new String ("HELLO");
		System.out.println(m10.toLowerCase());
		System.out.println(m5.toUpperCase());
		
		String [] temp = m6.split("-");
		for (String value : temp) {
			System.out.println(value);
		}

		
		
		//String.format() => 세자리에 있는 
		double d = 123456.345;
		String m13 = String.format("%,.2f",d);
		System.out.println(m13);
		System.out.printf("%,.3f %n",d);
		System.out.format("%s", m13);
		
		
	
	}
}