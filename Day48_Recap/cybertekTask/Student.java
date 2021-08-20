public class Student extends Person{
	private String schoolName;
	private int id;

	public Student(String name, char gender, LocalDate dOB){
		super(name, gender, dOB);
	}
}