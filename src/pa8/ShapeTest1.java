package pa8;



public class ShapeTest1{
public static void main(String[] args) {
    
    Shape[] shapes = new Shape[3];
    shapes[0] = new Rectangle(10, 20, 30, 40);
    shapes[1] = new Rectangle(30, 30, 10, 10);
    shapes[2] = new Circle(50, 20, 30);
    
    for (Shape s : shapes) {
       System.out.printf("Area: %.1f\n", s.getArea());
       System.out.printf("Length: %.1f\n", s.getLength());
    }
 
    
    Drawable[] drawables = new Drawable[4];
    for (int i=0; i < shapes.length; i++) { //drawables[0] = (Drawable) shapes[0] , drawables[1] = (Drawable) shapes[1] , drawables[2] = (Drawable) shapes[2]
       drawables[i] = (Drawable) shapes[i];
    }
    
    drawables[3] = new Text("Sample Text");
    for (Drawable d : drawables) {
       d.draw();
    }
    
    }
}