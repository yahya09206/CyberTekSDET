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

		System.out.println("-------------------------------");
	
		LocalDate DoB1 = LocalDate.of(1980, 12, 11);
		LocalDate DoB2 = LocalDate.of(1980, 12, 25);
		//check who is older
		if(DoB1.isBefore(DoB2)){
			System.out.println("DOB1 is older");
		}else {
			System.out.println("DOB2 is older");
		}

		//check who is younger
		if (DoB1.isAfter(DoB2)) {
			System.out.println("DoB1 is younger");
		}else {
			System.out.println("DoB2 is younger");
		}

		System.out.println("-------------------------------");
		//verify if specific year is leap year
		boolean r1 = DoB1.isLeapYear();
		System.out.println(r1);

		boolean r2 = LocalDate.of(2021, 1, 1).isLeapYear();
		System.out.println(r2);

		System.out.println("-------------------------------");
		//code to add date
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		//method to add days to current date
		LocalDate unitAssessment3 = currentDate.plusDays(14);
		System.out.println(unitAssessment3);

		//method to add months to current date
		LocalDate unitAssessment4 = currentDate.plusMonths(6);
		System.out.println(unitAssessment4);

		//method to add weeks to current date
		LocalDate examDate = currentDate.plusWeeks(5);
		System.out.println(examDate);

	}
}