public class Tester extends Employee{

	public Tester(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary){
		super(name, gender, dOB, employeeId, jobTitle, salary);
	}

	@Override
	public void work(){
		System.out.println(getJobTitle() + " " + getName() + " is testing");
	}
}