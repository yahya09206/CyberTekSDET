public class Amazon {
	public static void main(String[] args){

		//new instance of tester
		Tester tester = new Tester("James", 'M', 28, 11, "SDET", 120000);
		tester.eat("steak");

		//new instance of developer
		Developer developer = new Developer("Selda", 'F', 27, 12, "SDE", 150000);
		developer.eat("Java");

		//new instance of driver 
		Driver driver = new Driver("John", 'M', 68, 14, "Truck Driver", 85000);
		driver.eat("donuts");

	}
}