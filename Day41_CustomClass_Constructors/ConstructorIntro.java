public class ConstructorIntro {

	public ConstructorIntro(){
		System.out.println("Default Constructor");
	}

	public ConstructorIntro(int a){
		System.out.println("Constructor with int arg");
	}

	public static void main(String[] args){
		new ConstructorIntro(10);
	}


}