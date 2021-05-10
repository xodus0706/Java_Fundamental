package java_20210430;

public class CalenderDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1. 1년 1월 1일은 월요일 2. 1년은 365일이고. 운년은 366일 - 2월 29일 3. 윤년은 4년마다 발생하고 그
		 * 중에서 100배수는 제외하고 400배수는 제외하지 않는다. 4. 2021년 4월 30일은 무슨 요일일까요? 힌트) 2020년까지 총일수,
		 * 1-3월까지 총일수, 30을 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일
		 */

		int year = 2021;
		int month = 4;
		int day = 30;
		
		year -= 1;
		int total = year * 365 + year / 4 - year / 100 + year / 400 + 31+28+31+day;
		total %= 7;
		if (total == 1) {
			System.out.println("Monday");
		} else if (total == 2) {
			System.out.println("Tuesday");
		} else if (total == 3) {
			System.out.println("Wednesday");
		} else if (total == 4) {
			System.out.println("Thursday");
		} else if (total == 5) {
			System.out.println("Friday");
		} else if (total == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Sunday");

		}
	}
}
