public class Test {

	public String name;
	public static char gender;
	public String jobTitle;
	public int id;
	public static double salary;

	public static boolean isCybertekStudent;
	public static boolean isEmployed;

	static {
		isCybertekStudent = true;
		isEmployed = true;
	}

	public Test(String name, char gender, String jobTitle, int id, double salary){
		this.name = name;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.id = id;
		this.salary = salary;
	}

}