package java_20210510;

public class MemberDemo {
	//저장은 밑에서 하고 출력은 위에서 하고싶을때
	public static void print(Member m) {
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String addr1 = m.getAddr1();
		String addr2 = m.getAddr2();
		int age = m.getAge();
		
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(age);		
	}
	
	public static void main(String[] args) {
		Member m = new Member();
		//m.name="성영한";
		m.setName("성영한");
		m.setEmail("xodus0706@naver.com");
		m.setZipcode("09876");
		m.setAddr1("서울 용산구 이태원동");
		m.setAddr2("한강아파트 110동");
		m.setAge(20);
		print(m);
		
		//System.out.println(m.getName());=> 한번에 하는 방법
		
	}

}
