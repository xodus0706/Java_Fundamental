package java_20210504;

public class ExerciseDemo {
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;

	private boolean isLeafYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}

	private int getCount(int year, int month, int day) {
		int totalCount = 365 * (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		boolean isLeafYear = isLeafYear(year);
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}
		totalCount += day; 
		return totalcount;
	}
	
	
	public void print (int year, int month, int day) {
		int totalCount = getcount(year, month, day);
		int dayOfWeek = totalCount % 7;
		String message = "";
		if (dayOfWeek == Exercise)
	}
}