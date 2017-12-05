package pa8;



public abstract class Shape implements Drawable {
    double X,Y;

    public Shape(double X , double Y) {
    this.X = X;
    this.Y = Y;
    }
    public abstract double getArea();
    public abstract double getLength();

}