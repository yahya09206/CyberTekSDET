import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatting {
	public static void main(String[] args){
		DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		LocalDate today = LocalDate.now();
		System.out.println(today);
	}
}