public class Employee2 {

	public String name, jobTitle;
	public double salary;

	public Employee2(String name, String jobTitle, double salary){
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String toString(){
		return "Employee{" +
				"name= " + name + '\'' +
				", jobTitle =" + jobTitle + '\'' +
				", salary = " + salary + 
				'}';
	}
}