package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m =new MemberManager();
		m.insert("xodus0001", "김태연1", 10);
		m.insert("xodus0002", "김태연2", 20);
		m.insert("xodus0003", "김태연3", 30);
		m.insert("xodus0004", "김태연4", 40);
		
		ArrayList list = m.select();
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s %s %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===================================");

		m.update("xodus0002", "김태연2",100);
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s %s %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===================================");
		
		m.delete("xodus0001");
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s %s %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===================================");
	
		Member m3 = m.select("xodu0004");
		System.out.printf("%s, %s, %d %n", m3.getId(), m3.getName(), m3.getAge());
		
		
		
		
		
		
		
	}

}
