public class Student extends Person{
	private String schoolName;
	private int id;

	public Student(String name, char gender, LocalDate dOB, String schoolName, int id){
		super(name, gender, dOB);
		setSchoolName(schoolName);
		setId(id);
	}

	public String getSchoolName(){
		return schoolName;
	}

	public void setSchoolName(){
		this.schoolName = schoolName;
	}

	public id getId(){
		return id;
	}

	public void setId(){
		this.id = id;
	}

	public void study(){
		System.out.println(getName() + " is studying");
	}

	public attendClass(){
		System.out.println(getName() + " is attending class");
	}

	@Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "schoolName='" + schoolName + '\'' +
                ", id=" + id +
                '}';
    }
}