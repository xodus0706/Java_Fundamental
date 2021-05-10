package java_20210504;

;

public class CalederDemoNew {

	public static void main(String[] args) {

		int year = 2021;
		int month = 5;
		int day = 4;

		int goal = year - 1;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 윤년을 판단하는 공식
		// 400이 예외여서
		// 사실상 &&가 우선이므로 괄호 필요없음
		boolean isLeafYear = (goal % 4 == 0 && goal % 100 != 0) || goal % 400 == 0;
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		
		// 2021도 4월의 일수를 더한다.
		int total = 0;
		for (int i = 0; i < month - 1; i++) {
			total += monthArray[i];
		}
		total %= 7;
		String message = "";
		if (total == 1) {
			message = "월요일";
		} else if (total == 2) {
			message = "화요일";
		} else if (total == 3) {
			message = "수요일";
		} else if (total == 4) {
			message = "목요일";
		} else if (total == 5) {
			message = "금요일";
		} else if (total == 6) {
			message = "토요일";
		} else {
			message = "일요일";
		}

		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);
	}
}
