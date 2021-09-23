package Day50_ExceptionsCont;
public class Rectangle {
		
		private double length, width;

		public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
           throw new RuntimeException("No Such a Rectangle with a length of: "+length);
        }

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new RuntimeException("No Such a Rectangle with a width of: "+width);
        }
        this.width = width;
    }

    public Rectangle(double length, double width){
    	setWidth(width);
    	setLength(length);
    }

    public double area() {
        return length* width;
    }


    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }


}