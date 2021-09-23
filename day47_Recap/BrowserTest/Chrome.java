package BrowserTest;

public final class Chrome extends Browser {

//	public static final String name;
//
//	 public Chrome(String name){
//	 	this.name = name;
//	 }

    @Override
    public void open() {
        System.out.println("Opening Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }
}