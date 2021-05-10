package java_20210503;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =  0;
		for (int i = 1; i <= 10 ; i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 10까지 합은 %d이다.%n", sum);

		
	 int k = 0;
	 for (int i=2; i<=10; i+=2) {
		 k = k+i;
	 }
	 System.out.printf("1부터 10까지의 짝수합은 %d이다.%n",k);
	 
	 
	 
	 
	 int t =  0;
		for (int i = 1; i <= 10 ; i++) {
			if(i%2 == 0) {
			t = t + i;
		}
		}
		System.out.printf("1부터 10까지 짝수합은 %d이다.%n", t);
		
		
		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d =%d %n", first, second, first*second);
			}
		}
		
		
		for (int first = 2; first < 10; first++) {
			for (int second = 2; second < 10; second+=2) {
					System.out.printf("%d*%d=%d %n",first, second, first*second);
				}
			}
		
		
		
		
		//소수구하기
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		//1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수
		//예) 2,3,5,....
		for (int i = 2; i < 101; i++) {
			int count = 0;
			//j*j <= i  //j <= i/2
			for (int j = 2; j <= i; j++) {  
			if(i%j == 0 ) {
				count++;
				break;
			}
			totalIndex++;
			}
			//count=0은 소수를 의미
			if (count == 0) {
				totalCountOfPrimeNumber++;
				System.out.print(i +"\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		
			
		
		
		
		
		
		
		
		
		
	}

}
