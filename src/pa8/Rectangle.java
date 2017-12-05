package pa8;

public class Rectangle extends Shape {
	double X2, Y2;

	public Rectangle(double X, double Y, double X2, double Y2) {
		super(X, Y);
		this.X2 = X2;
		this.Y2 = Y2;
	}

	@Override
	public void draw() {
		System.out.printf("Rectangle: (%.1f %.1f)-(%.1f %.1f) \n", X, Y, X2, Y2);
	}

	@Override
	public double getArea() {
		double area = X2 * Y2;
		return area;
	}

	@Override
	public double getLength() {
		double length = 2 * (X2 + Y2);
		return length;
	}

    
}