public class Employee extends Person {

	private int employeeId;
	private String jobTitle;
	private double salary;

	public Employee(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary){
		super(name, gender, dOB);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public int getEmployeeId(){
		return employeeId;
	}

	public void setEmployeeId(){
		this.employeeId = employeeId;
	}

	public String getJobTitle(){
		return jobTitle;
	}

	public void setJobTitle(){
		this.jobTitle = jobTitle;
	}
}