public class Credentials {

	private String username, password;

	public String getUsername(){
		return username;
	}

	public String getPassword(){
		return password;
	}

	public void setUserName(String username){
		boolean startsWithLetter = Character.isLetter(username.char(0));
		if (!startsWithLetter) {
			return;
		}
		if(username.length() < 5){
			return;
		}
		this.username = username;
	}

	public void setPassword(String password){
		//exit method if pw is not strong enough
		if (!isStrongPassword(password)) {
			return;
		}
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
		return r1 && r2 && r3 && r4;
	}

	public String toString(){
		return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
	}
}