public class Employee extends Person {

	public long id;
	public String jobTitle;
	public double salary;

	//Constructor
	public Employee(String name, char gender, int age, long id, String jobTitle, double salary){
		super(name, gender, age);
		this.id = id;
		this.jobTitle = jobTitle;
		this.salary =  salary;
	}
}