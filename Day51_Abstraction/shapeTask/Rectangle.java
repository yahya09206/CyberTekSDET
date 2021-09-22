public class Rectangle extends Shape{

	private double l, w;

	public double getL(){
		return l;
	}

	public void setL(double l){
		if (l <= 0) {
			throw new RuntimeException("Invalid length: " + l);
		}
		this.l = l;
	}

	public double getW(){
		return l;
	}

	public void setw(double w){
		if (w <= 0) {
			throw new RuntimeException("Invalid length: " + w);
		}
		this.w = w;
	}

	public Rectangle(double l, double w){
		super(name);
		this.l = l;
		this.w = w;
	}


}