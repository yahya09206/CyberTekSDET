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
			setName(name);
			this.gender = gender;
			this.dOB = dOB;
			this.age = LocalDate.now().getYear() - this.dOB.getYear();
		}

		public String getName(){
			return name;
		}

		public void setName(){
			this.name = name;
		}

		public char getGender(){
			return gender;
		}

		public void setGender(){
			this.gender = gender;
		}

		public int getAge(){
			return age;
		}

		public void setAge(){
			this.age = age;
		}
	}
}