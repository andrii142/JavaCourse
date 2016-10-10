package module8.practice;

import java.util.Arrays;
import java.util.Map;

/**
 *  Условие задач:
 *  
 *  1. Создайте абстрактный класс Shape и его три потомка Rectanle, Square, Circle.
 *     Создайте "класс адаптер" Group, который мог бы группировать объекты типа Shape
 *     и его потомков (Rectanle, Square, Circle) и больше никаких других посторонних.
 *     
 *     Подсказка. Оборачиваем List в Group, при этом нужно реализовать такие же как
 *     у List методы: get по индексу, add фигуру, addAll по массиву и группе фигур,
 *     remove фигуру, removeAll по массиву и группе фигур, isEmpty, size, clear
 *     
 *  2. Реализуйте в классе Group такие методы как поиск фигуры с максимальной площадью
 *     getMaxArea, минимальной площадью getMinArea и метод подсчета площади всей группы
 *     фигур getSumArea.
 *     
 *     Подсказка. Для того чтобы реализовать поиск максимальной и минимальной площади
 *     нужно заимлеменьтить у класса Shape метод compareTo по площади фигур
 *     от класса Comparable.
 *     
 *     Для тех кто сделал раньше всех может реализовать теже методы в отдельном классе утилите
 *     в виде статических методов maxArea, minArea и sumArea соответственно по массиву фигур
 *     и по группе фигур.
 *     
 *  3. Реализовать в классе Group метод разделяющий фигуры по их типам getShapesSeparatedByType.
 *     Чтобы работало с:
 *     Map<ShapeType, Group<Shape>> shapesSeparatedByType = group.getShapesSeparatedByType()
 *     Map<ShapeType, Group<Rectangle>> shapesSeparatedByType = group.getShapesSeparatedByType()
 *     Map<ShapeType, Group<Square>> shapesSeparatedByType = group.getShapesSeparatedByType()
 *     Map<ShapeType, Group<Circle>> shapesSeparatedByType = group.getShapesSeparatedByType()
 *     
 *     Для тех кто сделал раньше всех может реализовать те же методы в классе утилите
 *     в виде статического метода getShapesSeparatedByType.
 *     
 *  4. Проверить на работоспособность код в Main классе. 
 *     
 */
public class Main {

  public static void main(String[] args) {
  
    Circle circle1 = new Circle(0, 0, 7.5);
    System.out.println(circle1.getArea());
    
    Circle circle2 = new Circle(0, 0, 6);
    System.out.println(circle2.getArea());
    
    Circle circle3 = new Circle(0, 0, 7);
    System.out.println(circle3.getArea());
    
    Square square = new Square(0, 0, 20);
    System.out.println(square.getArea());

    Rectangle rectangle = new Rectangle(0, 0, 20, 40);
    System.out.println(rectangle.getArea());
    
    //=============================================
    // Maximal and minimal area of shapes from list
    System.out.println("===");
    Group<Shape> group1 = new Group<>();

    Group<Shape> group2 = new Group<>();


    //Group<Circle> group = new Group<>();
    group1.add(null);
    group1.add(circle2);
    group1.add(circle3);
    group1.add(square);
    group1.add(rectangle);
    group1.add(null);

    group1.setShapes(ShapeUtil.deleteEmpty(group1.getShapes()));

    System.out.println(group1.getMaxArea());

   // System.out.println(group);

   // System.out.println(group.get(3));

   // System.out.println(group2);

   // group2.addAll(group1);

   // System.out.println(group2);


    
/*//    Shape maxArea = ShapeUtil.maxArea(group);
    Shape maxArea = group.getMaxArea();
    System.out.println(String.format("Shape with max area: [%s, %s]"
        , maxArea.getClassName(), maxArea.getArea()));
//    Shape minArea = ShapeUtil.minArea(group);
    Shape minArea = group.getMinArea();
    System.out.println(String.format("Shape with min area: [%s, %s]"
        , minArea.getClassName(), minArea.getArea()));

    //=============================================
    // Maximal and minimal area of shapes from array
    System.out.println("===");
    Shape[] shapes = {circle1, circle2, circle3, square, rectangle};
//    Circle[] shapes = {circle1, circle2, circle3};
//    Rectangle[] shapes = {square, rectangle};
//    group.addAll(shapes);
    maxArea = ShapeUtil.maxArea(shapes);
    System.out.println(String.format("Shape with max area: [%s, %s]"
        , maxArea.getClassName(), maxArea.getArea()));
    minArea = ShapeUtil.minArea(shapes);
    System.out.println(String.format("Shape with min area: [%s, %s]"
        , minArea.getClassName(), minArea.getArea()));

    //=============================================
    // Sum of all shapes area
    System.out.println("===");
//    System.out.println(String.format("Sum area of shapes: %s", ShapeUtil.sumArea(group)));
    System.out.println(String.format("Sum area of shapes: %s", group.getSumArea()));
    System.out.println(String.format("Sum area of shapes: %s", ShapeUtil.sumArea(shapes)));
    
    //=============================================
    // print shapes
    System.out.println("===");
//    if (!group.isEmpty()) {
//      group.clear();
//    }
    Printer.print(group);
    System.out.println(String.format("Group: %s", group));
    System.out.println(String.format("Array: %s", Arrays.toString(shapes)));
    
    //=============================================
    // Work with Map
    System.out.println("===");
//    Map<ShapeType, Group<Shape>> shapesByType = ShapeUtil.getShapesSeparatedByType(group);
    Map<ShapeType, Group<Shape>> shapesByType = group.getShapesSeparatedByType();
    for (ShapeType shapeType :shapesByType.keySet()) {
      Group<Shape> shapeList = shapesByType.get(shapeType);
      System.out.println(shapeList);
      System.out.println(String.format("Sum of %ss: %s", shapeType.toString().toLowerCase(), shapeList.getSumArea()));
    }
    
//    Map<ShapeType, Group<Rectangle>> shapesByType = ShapeUtil.getShapesSeparatedByType(group);
//    for (ShapeType shapeType :shapesByType.keySet()) {
//      System.out.println(shapesByType.get(shapeType));
//    }
    */
  }

}
