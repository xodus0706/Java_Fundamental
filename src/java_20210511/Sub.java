package java_20210511;

public class Sub extends Super {
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub gotoSchool() 호출");
	}
	//overriding: 부모의 메서드를 재정의
	//작성규칙
	//1. 반환향, 메서드 이름, 매개변수 일치
	//2. 접근한정자는 부모보다 자식이 상위이거나 같다.
	public void play (String starcraft) {
		//super.play("badook");
		 System.out.println("Sub play(~) 호출");
	}
	
	//Object 클래스에 toString method가 있다.
	public String toString(){
	return "서브클래스입니다.";
}
}
