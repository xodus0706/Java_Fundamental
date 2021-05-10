package java_20210506.bb;
import java_20210506.aa.Notice;
public class NoticeDemo2 extends Notice { //상속받은 서로다른 패키지 protected

	public static void main(String[] args) {
		//서로 다른 패키지의 클래스를 사용하기 위해서는 
		//import 구문을 사용해야한다.
		//package -> import -> class 순으로 코딩해야한다.
		Notice n1 = new Notice();
		n1.number = 1; //public 서로 다른 패키지에서도 접근 가능
		//n1.title = ""; //protected 서로 다른 패키지에서 접근하려면 상속받은 경우만 가능
		//n1.hit = 10; //default 서로 다른 패키지에서 접근 불가
		//n1.regdate = ""; //private 서로 다른 패키지에서 접근 불가능
		
		
		NoticeDemo2 n2 = new NoticeDemo2();
		n2.number = 2;
		n2.title = ""; //protected는 서로다른 패키지이므로 접근하려면 상속받은 경우만 가능함 
		               //부모에게서 상속받은 것이기에 부모것 모두 자식의 것
		//n2.hit = 10;
		//n2.regdate = "";
		

	}

}
