package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//char 리터럴 => 문자 표현법
		char c1 = '김';
		char c2 = '태';
		char c3 = '연';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		//char 리터럴 => 유니코드 표현법
		//backslash는 원화표시누르기
		char c4 = '\uAE40';
		char c5 = '\uD0DC';
		char c6 = '\uC5F0';
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		
		//char 리터럴 => 아스키코드 표현법
		//암호를 사용하는데 사용
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		//문자중에 사용할 수 없는 문자는 ',\
		//사용하기 위해서는 \를 사용해야 한다
		char c10 = '\'';
		char c11 = '\\';
		char c12 = '"';
		
		String path = "C:\\Users\\user";
		
		System.out.println(c10);
		System.out.println(c11);
		System.out.println(c12);
		
		System.out.println(path);
		
		
		//특수문자 \t \n
		// \n은 행을 바꿀때 사용
		System.out.print("안녕하세요.\n저는 김태연입니다.\n잘 부탁드립니다.\n");
		
		// \t는 tab띄어쓰기
		// tab을 두번쓰려면 \t\t으로 쓰면됨
		System.out.println("아이디\t\t이름\t지역");
		System.out.println("xodus0706\t김태연\t서울");
		
		
		
	}

}
