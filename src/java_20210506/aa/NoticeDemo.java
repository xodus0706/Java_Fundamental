package java_20210506.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n = new Notice();
		//같은 package내에서는 public, protected, default 접근가능
		n.number = 1; //public 접근가능
		n.title = "공지사항 입니다."; //protected 접근가능
		n.hit = 0; //default 접근가능
		//n.regdate = "2021-05-06"; //private 접근불가능
		
		
		
		
	}

}
