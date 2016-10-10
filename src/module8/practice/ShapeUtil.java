package module8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ShapeUtil {

    static <T extends Shape> List<T> deleteEmpty(List<T> list) {
        List<T> res = new ArrayList<>();
        for(T shape : list) {
            if(shape != null) res.add(shape);
        }

        return res;
    }
  
  /*// Sum of all shapes area
  public static <T extends Shape> double sumArea(Group<T> shapes) {
    if (shapes.isEmpty()) {
      return 0;
    }
    double result = 0;
    for (Shape shape : shapes) {
      result += shape.getArea();
    }
    return result;
  }
  
  public static <T extends Shape> double sumArea(T[] shapes) {
    Group<T> group = new Group<>();
    group.addAll(shapes);
    return sumArea(group);
  }
  
  // Maximal area of shapes from group
  public static <T extends Shape> T maxArea(Group<T> shapes) {
    if (shapes.isEmpty()) {
      return null;
    }
    T result = shapes.get(0);
    T element;
    for (int i = 1; i < shapes.size(); i++) {
      element = shapes.get(i);
      if (element.compareTo(result) > 0) {
        result = element;
      }
    }
    return result;
  }
  
  // Maximal area of shapes from array
  public static <T extends Shape> T maxArea(T[] shapes) {
    Group<T> group = new Group<>();
    group.addAll(shapes);
    return maxArea(group);
  }
  
  // Minimal area of shapes from group
  public static <T extends Shape> T minArea(Group<T> shapes) {
    if (shapes.isEmpty()) {
      return null;
    }
    T result = shapes.get(0);
    T element;
    for (int i = 1; i < shapes.size(); i++) {
      element = shapes.get(i);
      if (element.compareTo(result) < 0) {
        result = element;
      }
    }
    return result;
  }
  
  // Minimal area of shapes from array
  public static <T extends Shape> T minArea(T[] shapes) {
    Group<T> group = new Group<>();
    group.addAll(shapes);
    return minArea(group);
  }
  
  // Work with Map
  public static <T extends Shape> Map<ShapeType, Group<T>> getShapesSeparatedByType(Group<T> list) {
    Map<ShapeType, Group<T>> result = new TreeMap<>();
    for (T shape : list) {
      if (shape instanceof Circle) {
        if (result.containsKey(ShapeType.CIRCLE)) {
          result.get(ShapeType.CIRCLE).add(shape);
        } else {
          Group<T> circles = new Group<>();
          circles.add(shape);
          result.put(ShapeType.CIRCLE, circles);
        }
      } else if (shape instanceof Square) {
        if (result.containsKey(ShapeType.SQUARE)) {
          result.get(ShapeType.SQUARE).add(shape);
        } else {
          Group<T> circles = new Group<>();
          circles.add(shape);
          result.put(ShapeType.SQUARE, circles);
        }
      } else if (shape instanceof Rectangle) {
        if (result.containsKey(ShapeType.RECTANGLE)) {
          result.get(ShapeType.RECTANGLE).add(shape);
        } else {
          Group<T> circles = new Group<>();
          circles.add(shape);
          result.put(ShapeType.RECTANGLE, circles);
        }
      } else {
        if (result.containsKey(ShapeType.OTHER)) {
          result.get(ShapeType.OTHER).add(shape);
        } else {
          Group<T> circles = new Group<>();
          circles.add(shape);
          result.put(ShapeType.OTHER, circles);
        }
      }
      
    }
    return result;
    
  }*/
  
}
