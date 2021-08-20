import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Cybertek {

	public static void main(String[] args){

		Tester tester = new Tester("Yasin", 'M', LocalDate.of(1995, 5, 28), 13, "Tester", 125000);
		Developer developer = new Developer("Mucahit", 'M', LocalDate.of(1992, 6, 16), 12, "Java Dev", 120000);
		Teacher teacher = new Teacher("Asiya", 'F', LocalDate.of(1996, 8, 19), 18, "Softskill Teacher", 95000);
		Student student = new Student("Yulia", 'F', LocalDate(1996, 7, 19), "Cybertek", 29);
	}
}