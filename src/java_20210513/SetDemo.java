package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet 클래스는 데이터 (객체)의 중복을 허용하지 않고, 군서가 없음
		//HashSet set = new HashSet();
		//TreeSet 클래스는 오름차순을 할 수 있음
		//TreeSet에서 문자열의 출력은 1과 관련된것 쭉, 2와 관련된것 쭉--> 오름차순 정렬이 되지 않는다.
		//TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고,
		//natural ordering(숫자일때와 문자일때 정렬방식이 다름)을 한다.
		//TreeSet set = new TreeSet();
		//LinkedHashSet 클래스는 데ㅣ터의 중복을 허용하지 않고, 순서는 FIFO(First In, First Out)
		LinkedHashSet set = new LinkedHashSet();
		//순서가 뒤죽박죽 나옴
		
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(11);
		set.add(12);
		set.add(43);
		set.add(15);
		set.add(27);
		
		System.out.println(set.size());
		//HashSet 클래스는 자체적으로 출력할 방법이 없음
		//HashSet을 Iterator로 변환해서 출력해야 함
		Iterator i = set.iterator();
		//hasNext() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드
		//있으면 true, 없으면 false
		while(i.hasNext()) { 
			Integer temp = (Integer)i.next();
			System.out.println(temp);
		}
		
		StringBuffer s1 = new StringBuffer("a");
		StringBuffer s2 = new StringBuffer("a");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		
		//HashSet 클래스는 데이터의 중복을 판단할때 equals()로 비교해서 true가 나오면 데이터가 중복되었다고 판단하여
		//데이터를 추가해 주지 않음
		HashSet set1 =new HashSet();
		set.add(s1);
		set.add(s2);
		
		System.out.println(set1.size());
		
		//HashSet 클래스는 데이터의 중복을 판단할때 compareTo()로 비교해서 0가 나오면 데이터가 중복되었다고 판단하여
		//데이터를 추가해 주지 않음
		TreeSet set2 = new TreeSet();
		set2.add(s1);
		set2.add(s2);
		System.out.println(set2.size());
	}

}
