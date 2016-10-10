package module8.practice;

public class Square extends Rectangle {

  public Square(double x, double y, double hight) {
    super(x, y, hight, hight);
  }

  @Override
  public String toString() {
    return "Square ["
        + getPoint() 
        + ", hight=" + getHight() 
        + ", width=" + getWidth() 
        + ", area=" + getArea()
        + "]";
  }

}
