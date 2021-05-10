package java_20210430;

public class CalederDemoNew {
	
	public static void main(String[] args) {

		int year = 2021;
		int month = 4;
		int day = 30;
		
		int goal= year-1;
		int total = goal * 365 + goal / 4 - goal / 100 + goal / 400 + 31+28+31+day;
		total %= 7;
		String message = "";
		if (total == 1) {
			message="Monday";
		} else if (total == 2) {
			message="Tuesday";
		} else if (total == 3) {
			message="Wednesday";
		} else if (total == 4) {
			message="Thursday";
		} else if (total == 5) {
			message="Friday";
		} else if (total == 6) {
			message="Saturday";
		} else {
			message="Sunday";
		}
		
		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);
	}
}

