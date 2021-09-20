public class Browser {

	public void open(){
		System.out.println("Opening Chrome Browser");
	}

	public void close(){
		System.out.println("Closing Chrome Browser");
	}

	public final void navigate(String url){
		System.out.println("Type: " + url);
		System.out.println("Press enter");
	}

	public final void refresh(){
		System.out.println("F5");
	}

	public final void backward(){
		System.out.println("backward");
	}

	public final void forward(){
		System.out.println("forward");
	}
}