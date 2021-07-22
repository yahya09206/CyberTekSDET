import java.time.LocalDateTime;
public class LocalDateTimeIntro {
	public static void main(String[] args){

		//combine both local date and local time
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		LocalDate date = LocalDate.of(2021, 8, 5);
		LocalTime time = LocalTime.of(17, 45);

		LocalDateTime dateTime = LocalDateTime.of(date, time);
	}
}