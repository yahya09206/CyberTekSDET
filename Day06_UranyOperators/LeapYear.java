public class LeapYear {
	public static void main(String[] args){
		int year = 2021;
		boolean isLeapYear = year % 4 == 0;
		System.out.println("Is " + year + " a leap year? " + isLeapYear);
	}
}