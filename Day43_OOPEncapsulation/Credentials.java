public class Credentials {

	private String username, password;

	public String getUsername(){
		return username;
	}

	public String getPassword(){
		return password;
	}

	public void setUserName(){
		this.username = username;
	}

	public void setPassword(){
		this.setPassword = password;
	}

	//check if strong password
	public static boolean isStrongPassword(String password){
		boolean r1 = password.length() >= 8 && !password.contains(" ") && !password.contains(",");
		boolean r2 = false,
				r3 = false,
				r4 = false;
		for (char each : password.toCharArray()) {
			//check if pw contains letters
			if(Character.isLetter(each)){
				r2 = true;
				//check if pw contains special character
			}else if(!Character.isLetterOrDigit(each)){
				r3 = true;
			}else {
				//check if pw contains at least one digit
				r4 = true;
			}
		}
	}
}