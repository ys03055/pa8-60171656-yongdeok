package pa8;

public class Triangle extends Shape {
    double X3,Y3;
	private double width;
	private double bottom;

    public Triangle(double X, double Y,double bottom,double width) {
    	super(X,Y);
        this.bottom = bottom;
        this.width = width;
    }
    @Override
    public void draw() {
    	
    }
	@Override
	public double getArea() {
		double area = bottom*width*1/2;
		return area;
	}
	@Override
	public double getLength() {
		double hypo=Math.sqrt(width*width+(bottom/2)*(bottom/2));
		
		double length = 2*hypo+bottom;
		return length;
	}

    
}