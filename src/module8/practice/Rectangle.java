package module8.practice;

public class Rectangle extends Shape {
  private double hight;
  private double width;

  public Rectangle(double x, double y, double hight, double width) {
    super(new Point(x, y));
    this.hight = hight;
    this.width = width;
  }

  public double getHight() {
    return hight;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public double getArea() {
    return hight * width;
  }

  @Override
  public String toString() {
    return "Rectangle ["
        + getPoint() 
        + ", hight=" + hight 
        + ", width=" + width 
        + ", area=" + getArea()
        + "]";
  }
  
}
