import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Person {
	public static void main(String[] args){

		private String name;
		private final char gender;
		private final int age;
		private final LocalDate dOB;

		public Person(String name, char gender, int age, LocalDate dOB){
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.dOB = dOB;
		}
	}
}