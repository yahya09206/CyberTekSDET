package Day48_Recap.cybertekTask;

import java.time.LocalDate;
public class Cybertek {

	public static void main(String[] args){

		Tester tester = new Tester("Yasin", 'M', LocalDate.of(1995, 5, 28), 13, "Tester", 125000);
		tester.eat("doritos");
		tester.drink("Kombucha");
		tester.sleep();
		System.out.println("-----------------------------------");

		Developer developer = new Developer("Mucahit", 'M', LocalDate.of(1992, 6, 16), 12, "Java Dev", 120000);
		developer.eat("pizza");
		developer.drink("beer");
		developer.sleep();
		System.out.println("-----------------------------------");

		Teacher teacher = new Teacher("Asiya", 'F', LocalDate.of(1996, 8, 19), 18, "Softskill Teacher", 95000);
		teacher.eat("celery");
		teacher.drink("coffee");
		teacher.sleep();
		System.out.println("-----------------------------------");

		Student student = new Student("Yulia", 'F', LocalDate.of(1996, 7, 19), "Cybertek", 29);
		student.eat("doritos");
		student.drink("Kombucha");
		student.sleep();
	}
}