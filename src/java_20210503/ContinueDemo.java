package java_20210503;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for( int i = 1; i <=10; i++) {
			//i==6일때 다시 조건으로 들어가라 
			//6을 더하지 말아라
			//if (i != 6)
			if (i==6) continue; 
			sum+=i;
			
		}
		System.out.println("합은:"+sum);
		
		
		
		
		
		
		
		
	}

}
