import java.time.LocalDate;

public class LocalDateIntro {
	public static void main(String[] args){

		//local date for random day
		LocalDate eid = LocalDate.of(2021, 7, 20);
		System.out.println(eid);

		//local date for today
		LocalDate today = LocalDate.now();
		System.out.println(today);

		System.out.println("-------------------------------");
		//create array of strings and store five classmates names
		String[] names = {"Feruza", "Gulistan", "Nazli", "Ahmad", "Saron"};
		//declare array of birth dates using LocalDate
		LocalDate[] DoB = {LocalDate.of(1990, 5, 25), LocalDate.of(1991, 10, 15), 				   LocalDate.of(1991, 1, 9), LocalDate.of(2000, 3, 30), 				   LocalDate.of(1995, 8, 13),
		};
		//loop thru names and birthdays
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ", was born on: " + DoB[i]);
		}

	}
}