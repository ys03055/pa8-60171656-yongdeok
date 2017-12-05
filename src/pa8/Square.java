package pa8;



public class Square extends Shape {
    double X4,Y4;
	private double width;

    public Square(double X, double Y,double width) {
    	super(X,Y);
        this.width = width;
        
    }
    @Override
    public void draw() {
    	
    }
	@Override
	public double getArea() {
		double area = width*width;
		return area;
	}
	@Override
	public double getLength() {
		double length = 4*(width);
		return length;
	}

    
}