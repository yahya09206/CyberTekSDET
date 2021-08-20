public final class Teacher extends Employee {

	public Teacher(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary){
		super(name, gender, dOB, employeeId, jobTitle, salary);
	}

	@Override
	public void work(){
		System.out.println(getJobTitle() + " " + getName() + " is attending");
	}

	@Override
	public void attendMeeting(){
		System.out.println(getJobTitle() + " " + getName() + " is attending");
	}
}