package module8.practice;

public class Circle extends Shape {

  private double radius;

  public Circle(double x, double y, double radius) {
    super(new Point(x, y));
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle [" 
        + getPoint() 
        + ", radius=" + radius
        + ", area=" + getArea()
        + "]";
  }
  
}
