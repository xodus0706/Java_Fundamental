package java_20210507;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	public void m1() {
		System.out.println("instance method m1() 호출");
	}
	public void m2() {
		//instance method에서는 모든 변수를 사용하고, 모든 메서드를 호출할 수 있음
		this.name = "성영한"; //this. => 자기자신 인스턴스
		StaticMethodDemo.interestRate = 3.4; //static변수 앞에는 class명이 생략되어있음
		this.m1();
		StaticMethodDemo.m3();
	}
	public static void m3() {
		System.out.println("static method m3() 호출");
	}
	public static void m4() {
		//static method에서는 static 변수와 static 메서드만 사용할 수 있음
		//name = "홍길동";//이름을 static으로 바꾸면 모두 이름을 공유하는 것이므로 말이 되지 않음 
		              //따라서 void를 instance러 바꿈 public void m4(){
		interestRate = 4.3;
		//m1();
		m3();
	}
		public static void main(String[] args) {//static은 클래스 이름으로 접근
			                                    //instance는 this.으로 접근
			m3();
			m4();
			interestRate = 4.3;
			StaticMethodDemo smd = new StaticMethodDemo();
			smd.name = "성영한";
			smd.m1();
			
			
		}
	}


