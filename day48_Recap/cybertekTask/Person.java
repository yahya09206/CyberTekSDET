package Day48_Recap.cybertekTask;

import java.time.LocalDate;
public class Person {

		private String name;
		private final char gender;
		private final int age;
		private final LocalDate dOB;

		public Person(String name, char gender, LocalDate dOB){
			setName(name);
			this.gender = gender;
			this.dOB = dOB;
			age = LocalDate.now().getYear() - this.dOB.getYear();
		}

		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		public char getGender(){
			return gender;
		}

		public int getAge(){
			return age;
		}

		public LocalDate getdOB(){
			return dOB;
		}

		public void eat(String food){
			System.out.println(name + " is eating " + food);
		}

		public void drink(String drink){
			System.out.println(name + " is drinking " + drink);
		}

		public void sleep(){
			System.out.println(name + " is sleeping");
		}

		@Override
		public String toString(){
			//copy from person class
			return
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dOB=" + dOB;
		}
}