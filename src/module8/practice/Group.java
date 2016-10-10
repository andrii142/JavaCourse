package module8.practice;

import java.util.*;

public class Group<T extends Shape> implements Iterable<T> {

    private List<T> shapes;

    public Group() {
        this.shapes = new ArrayList<>();
    }

    public T get(int index) {
        return shapes.get(index);
    }

    public void add(T shape) {
        //can be good solution
       // if(shape != null)
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

    //v1
  /*public void addAll(T[] arShapes) {
    for (T shape : arShapes) {
      add(shape);
    }
  }*/

    public void addAll(T[] arShapes) {
        shapes.addAll(Arrays.asList(arShapes));
    }

    public void remove(T shape) {
        shapes.remove(shape);
    }

    public void removeAll(Group<T> group) {
        shapes.removeAll(group.getShapes());
    }

    public void removeAll(T[] arShapes) {
        for (T shape : arShapes) {
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

    public T getMaxArea() {
        if(shapes.isEmpty()) return null;

        T shapeWithMaxArea = shapes.get(0);

        for (T t : shapes) {
            if (t.getArea() > shapeWithMaxArea.getArea()) {
                shapeWithMaxArea = t;
            }
        }

        return shapeWithMaxArea;
    }

    public double getSumArea() {
        if (shapes.isEmpty()) {
            return 0;
        }

        shapes = ShapeUtil.deleteEmpty(shapes);

        double result = 0;
        for (T shape : shapes) {
            result += shape.getArea();
        }
        return result;
    }

  /*public T getMaxArea() {

    T result = shapes.get(0);
    T element;
    for (int i = 1; i < shapes.size(); i++) {
      element = shapes.get(i);
      if (element.compareTo(result) > 0) {
        result = element;
      }
    }
    return result;
  }*/


    /**
     * Minimal area of shapes from group
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

    public void setShapes(List<T> shapes) {
        this.shapes = shapes;
    }

    /**
     * Work with Map
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
