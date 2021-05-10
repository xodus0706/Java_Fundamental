package java_20210503;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i <= 10; i++) {
			if (i==6)break;
			sum+=i;
		}
		System.out.println("합은 : "+sum);
		
		
		
		
		int sum1 = 0;
		for(int i = 0; i<=10; i++) {
			if (i == 6)break;
			sum1=+i;
		}
		System.out.printf("합은 %d이다.",sum1);
		
		
		int sum2 = 0;
		aa: for(int i =1; i <= 10; i++) {
			if(i==6)break aa;
		sum2=+i;
		System.out.println("합은:"+sum2);
		
		}
		
		
		outter:
			for (int k = 2; k<=9; k++) {
				inner:
					for(int j = 1; j <= 9; j++) {
						if (k==4 && j==8) break inner;
						System.out.printf("%d * %d = %d %n",k,j,k*j);
					}
			
		
			}
		}
	
}
		
	
