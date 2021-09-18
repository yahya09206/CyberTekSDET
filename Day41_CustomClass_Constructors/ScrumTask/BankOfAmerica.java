public class BankOfAmerica {
	public static void main(String[] args){

		Tester tester1 = new Tester("John", 'M', "QA", 10, 100000);
		Tester tester2 = new Tester("Abbos", 'M', "SM", 11, 110000);
		Tester tester3 = new Tester("Selda", 'F', "SM", 12, 120000);

		Tester[] testers = {tester1, tester2, tester3};

		Developer developer1 = new Developer("Zorana", 'F', "SDE", 13, 125000);
		Developer developer2 = new Developer("Mehmet", 'M', "Java Dev", 14, 130000);
		Developer developer3 = new Developer("Yulia", 'F', "SDE", 15, 135000);
		Developer developer4 = new Developer("Yasin", 'M', "Java Dev", 16, 140000);

		Developer[] developers = {developer1, developer2, developer3};

		ScrumTeam scrum1 = new ScrumTeam("Shazia", "Fhillip", "Aysu");
		scrum1.hireTester(tester1);
		scrum1.hireDeveloper(developer1);
		scrum1.hireTester(testers);
		scrum1.hireDeveloper(developers);

		System.out.println(scrum1);

		double budget = 0;

		for(Tester each : scrum1.testers){
			System.out.println(each);
		}

	}
}