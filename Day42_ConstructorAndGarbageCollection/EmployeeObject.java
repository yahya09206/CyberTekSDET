public class EmployeeObject {
	public static void main(String[] args){

		Employee employee1 = new Employee("Johnny");
		System.out.println(employee1);

		Employee employee2 = new Employee("Johnny", "SDET", 2344, 125000);
		System.out.println(employee2);
	}
}