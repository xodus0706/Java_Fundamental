package java_20210513;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer ("hello");
		StringBuffer s2 = new StringBuffer ("hello");
		
		System.out.println(s1 == s2);
		//object에 있는 StringBuffer을 overriding하지 않아서 false로 나옴
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		
		String str1 =  s1.toString();
		String str2 =  s2.toString();
		//toString()으로 하여 overriding을 함 
		//따라서 true로 나옴
		//문자열 조작을 위해서는 toString()이 필요
		System.out.println(str1.equals(str2));
		
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = '성영한' ");
		
		System.out.println(sql);
		
		//sql의 모든 문자열 지우기
		//이 문장이 없을경우, 앞문장 뒤로 연결해서 쓰게됨
		//select name, age from member where name = '성영한' select no, writer from board
		sql.setLength(0);
		
		sql.append("select no, writer from board");
		System.out.println(sql);
	}
}
