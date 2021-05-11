package java_20210511;

public class SubDemo {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makemoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();
		//sub의 play가 호출됨
		sub.play("~~~");
		
		
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makemoney();
		sup.play("~~");
		
		//접근할 수 있는 것은 super밖에 없음
		Super sup1 = new Sub();
		System.out.println(sup1.money);
		sup1.makemoney();
		//overriding되어있는 것을 호출할 경우, 하위클래스(sub)에 있는 것을 호풀하게 된다.
		sup1.play("~");
		
		System.out.println(sub);
		//toString()method는 object클래스에 정의된 것이다.
		//
		System.out.println(sub.toString());
		
		Object obj = new Sub();
		System.out.println(obj.toString());
		
	}

}
