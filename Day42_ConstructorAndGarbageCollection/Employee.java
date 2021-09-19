public class Employee {

	public String name, jobTitle;
	public int id;
	public double salary;

	public Employee(String name){
		this.name = name;
	}

	public Employee(String name, String jobTitle){
		this(name); // this.name = name;
		this.jobTitle = jobTitle;
	}

	public Employee(String name, String jobTitle, int id){
		this(name, jobTitle);
		this.id = id;
	}

	public Employee(String name, String jobTitle, int id, double salary){
		this(name, jobTitle, id);
		this.salary = salary;
	}
}