import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatting {
	public static void main(String[] args){
		DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");

		LocalDate today = LocalDate.now();
		System.out.println(today);
		today.format(DF);
		System.out.println(today.format(DF));

		System.out.println("-----------------------------------");
		//format time
		DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm");
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime.format(TF));
	}
}