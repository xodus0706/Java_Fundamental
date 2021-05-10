package java_20210510;

public class MemberPayDemo {
	public static void main(String[] args) {
		MemberPay m =new MemberPay(); //default값으로 int=0, boolean=false, String=null로 저장
		m.setSeq(1); //오더번호 1번
		m.setGroup(1); //private이 아니었다면 m.group = 1;로 표현
		m.setName("자바 일주일만에 완성하기");
		m.setPrice(500_000);
		m.setStatus("1");
		m.setValid(true);
		m.setSdate("2021-05-10");
		m.setEdate("2021-12-31");
		m.setRegdate("2021-05-10");
		
		
		
		
		System.out.println(m.getSeq());
		System.out.println(m.getGroup());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		System.out.println(m.getStatus());
		System.out.println(m.isValid()); //boolean은 getter함수가 isXXX로 적용
		System.out.println(m.getSdate());
		System.out.println(m.getEdate());
		System.out.println(m.getRegdate());
		
	}

}
