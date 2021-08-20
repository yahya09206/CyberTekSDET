public class Employee extends Person {

	private int employeeID;
	private String jobTitle;
	private double salary;

	public Employee(String name, char gender, LocalDate dOB, int employeeID, String jobTitle, double salary){
		super(name, gender, dOB);
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
}