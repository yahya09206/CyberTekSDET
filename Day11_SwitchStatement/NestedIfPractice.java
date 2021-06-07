public class NestedIfPractice {
	public static void main(String[] args){

		 String batchType = "US morning";
		 boolean isValid = batchType == "US morning" || batchType == "US evening" || batchType == "EU";
		 String result = "";

		 if(isValid){
		 	if(batchType == "US morning"){
		 		result = "10am-5pm EST. M, T, Th, F";
		 	}else if(batchType == "US evening"){
		 		result = "7pm-10pm EST. M, T, W, Th, S, S";
		 	}else {
		 		result = "10am-5pm EST. M, T, W, Th, F";
		 	}
		 }else {
		 	result = "Invalid Batch";
		 }
		 System.out.println("result = " + result);
		 System.out.println("-------------------------------------");

		 int age = 45;
		 String ageGroup = "";

		 if(age >= 0 && age <= 150){
		 	if(age < 21){
		 		ageGroup = "Teenager";
		 	}else if(age >= 21 && age < 55){
		 		ageGroup = "Adult";
		 	}else {
		 		ageGroup = "Senior";
		 	}
		 }else{
		 	ageGroup = "Invalid";
		 }
		 System.out.println(ageGroup);
	}
}