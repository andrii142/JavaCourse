package module8.practice;

import java.util.*;

public class Group <T extends Shape> implements Iterable<T> {

  private List<T> shapes;

  public Group() {
    this.shapes = new ArrayList<>();
  }

  public T get(int index) {
    return shapes.get(index);
  }

  public void add(T shape) {
    this.shapes.add(shape);
  }

  //v0
 /* public void addAll(Group<T> group) {
    Iterator<T> iterator = group.iterator();
    while (iterator.hasNext()) {
      T shape = iterator.next();
      add(shape);
    }
  }*/


  //v1
  /*public void addAll(Group<T> group) {
    List<T> allShapesInGroup = group.getShapes();

    for (T t : allShapesInGroup) {
      shapes.add(t);
    }
  }*/

  //v2
 /* public void addAll(Group<T> group) {
    List<T> allShapesInGroup = group.getShapes();
    shapes.addAll(allShapesInGroup);
  }*/

  //v3
  public void addAll(Group<T> group) {
    shapes.addAll(group.getShapes());
  }



 /* public void addAll(T[] shapes) {
    for (T shape : shapes) {
      add(shape);
    }
  }

  public void remove(T shape) {
    this.shapes.remove(shape);
  }

  public void removeAll(Group<T> shapes) {
    Iterator<T> inerator = shapes.iterator();
    while (inerator.hasNext()) {
      T shape = inerator.next();
      remove(shape);
    }
  }

  public void removeAll(T[] shapes) {
    for (T shape : shapes) {
      remove(shape);
    }
  }

  public int size() {
    return shapes.size();
  }

  public boolean isEmpty() {
    return shapes.isEmpty();
  }

  public void clear() {
    shapes.clear();
  }

  *//**
   *  Sum of all shapes area
   *//*
  public double getSumArea() {
    if (shapes.isEmpty()) {
      return 0;
    }
    double result = 0;
    for (T shape : shapes) {
      result += shape.getArea();
    }
    return result;
  }

  *//**
   *  Maximal area of shapes from group
   *//*
  public T getMaxArea() {
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

  *//**
   *  Minimal area of shapes from group
   *//*
  public T getMinArea() {
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

  */

  @Override
  public Iterator<T> iterator() {
    return shapes.iterator();
  }

  public List<T> getShapes() {
    return shapes;
  }

  /**
   *  Work with Map
   *//*
  public Map<ShapeType, Group<T>> getShapesSeparatedByType() {
    Map<ShapeType, Group<T>> result = new TreeMap<>();
    for (T shape : shapes) {
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




  @Override
  public String toString() {
    return shapes.toString();
  }
}
