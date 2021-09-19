public class Employee {

	public String name, jobTitle;
	public int id;
	public double salary;

	public Employee(String name){
		this.name = name;
	}

	public Employee(String name, String jobTitle){
		this.name = name;
		this.jobTitle = jobTitle;
	}
}