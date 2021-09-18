import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.ArrayList;

public class MovieObjects {
	public static void main(String[] args){

		Movie movie1 = new Movie();
		movie1.setInfo("Taken", "USA", "Action, Thriller", 
						"Quentin", LocalDate.of(2008, 5, 17));
		String[] casts = {"Yahya", "Igor"};
		movie1.addCast("Gulistan");
		movie1.addCast(casts);

		ArrayList<String> students = new ArrayList<>();
		students.addAll(Arrays.asList("Feruza", "Ahmad", "Kadar", "Nazli", "Ahmet"));
		movie1.addCast(students);

		System.out.println(movie1);
	}
}