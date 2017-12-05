package pa8;

public class Circle extends Shape {
	double radius;

	public Circle(double X, double Y, double radius) {
		super(X, Y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.printf("Circle center: (%.1f %.1f)-radius(%.1f)\n", X, Y, radius);
	}

	public double getArea() {
		double area = 3.14 * (radius * radius);
    	return area;
    }
//    public double getLength() {
//    	
//    }
	@Override
	public double getLength() {
		double length = 3.14*(2*radius);
    	return length;
	}
    }