package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;

public class Lotto_TreeSet {
		public static void main(String[] args) {
		TreeSet lottoSet = new TreeSet();
		while(true) {
			int random = (int)(Math.random()*45)+1;
			//add에는 object이므로 primitive가 들어가지 못함
			lottoSet.add(random);//하지만 auto-boxing이 일어남
			if(lottoSet.size() == 6) break;
		}
		Iterator i = lottoSet.iterator();
		while(i.hasNext()) { 
			Integer temp = (Integer)i.next(); //해당 객체를 가져온다.
			System.out.print(temp+ "\t");
		
		}
		}
}