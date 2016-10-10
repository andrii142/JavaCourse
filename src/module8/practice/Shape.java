package module8.practice;

public abstract class Shape implements Comparable<Shape> {

  private Point point;
  
  public Shape(Point point) {
    this.point = point;
  }

  public Point getPoint() {
    return point;
  }

  public abstract double getArea();
  
  public String getClassName() {
    return this.getClass().getSimpleName();
  }
  
  @Override
  public int compareTo(Shape shape) {
   /* final double firstArea = getArea();
    final double secondArea = shape.getArea();

    if (firstArea > secondArea) {
      return 1;
    }
    if (firstArea < secondArea) {
      return -1;
    }
    return 0;*/

    //better option
    return Double.compare(getArea(), shape.getArea());
  }
}
