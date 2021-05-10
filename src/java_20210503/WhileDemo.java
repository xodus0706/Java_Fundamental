package java_20210503;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;//초기값
		while(i <= 10) {//조건
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지 합은 %d입니다.\n",sum);
		
		for (int j = 1; j <= 10; j++) {
			sum+=j;
			
		}
		System.out.printf("1부터 10까지 합은 %d입니다.\n",sum);
		int k = 1;
		for(;k<=10;) {
		sum += k;
			k++;
		}
			
		System.out.printf("1부터 10까지 합은 %d입니다.",sum);
		
		
		
		int first = 2;
		while(first <= 9) {
			System.out.printf("%d단 입니다. %n", first);
			
			int second = 1;
			while (second <= 9) {
				System.out.printf("%d*%d = %d %n", first, second, first*second);
				second++;
			}
			first++;
			}
		
		
		for (int j = 2; j < 10; j++) {
			System.out.printf("%d단 입니다. %n", j);
			for (int j2 = 1; j2 < 10; j2++) {
				System.out.printf("%d*%d=%d %n",j, j2, j*j2);
				
			}
		}
	
		

		
	}

}
