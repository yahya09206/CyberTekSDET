import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
	public static void main(String[] args){
		DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY EEEE");

		LocalDate today = LocalDate.now();
		System.out.println(today);
		today.format(DF);
		System.out.println(today.format(DF));

		System.out.println("-----------------------------------");
		//format time
		DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime.format(TF));
		LocalTime time1 = LocalTime.of(17, 25);
		System.out.println(time1);
		System.out.println(time1.format(TF));

		System.out.println("-----------------------------------");
		//format time and date together
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY hh:mm a");
		LocalDateTime a = LocalDateTime.now();
		System.out.println(a);
		System.out.println(a.format(DTF));

		System.out.println("-----------------------------------");
		//Task Tuesday, 01:00 PM, Nov/24/2020
		LocalDateTime time2 = LocalDateTime.of(2020, 11, 24, 13, 0);
		DateTimeFormatter LDTF = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");
		System.out.println(time2);
		System.out.println(time2.format(LDTF));

	}
	public static String nameOfTheDay(int year, int month, int day){
		String result =  LocalDate.of(year, month,day).format(  DateTimeFormatter.ofPattern("EEEE")  );
		return result;
	}
}