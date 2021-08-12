public class Rectangle {

	private double length, width;

	public double getLength(){
		return length;
	}

	public void setLength(double length){
		if (length < 0) {
			return;
		}
		this.length = length;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		if (width < 0) {
			return;
		}
		this.width = width;
	}

	public double area(){
		return length * width;
	}

	public double perimeter(){
		return 2 * (length + width);
	}

	//compare two rectangles
	public boolean equals(Rectangle rectangle){
		return perimeter() == rectangle.perimeter();
	}

	public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}