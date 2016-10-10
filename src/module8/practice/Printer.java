package module8.practice;

import java.util.Iterator;

public class Printer {

  // print shapes
  public static <T extends Shape> void print(Group<T> shapes) {
    Iterator<T> iterator = shapes.iterator();
    while (iterator.hasNext()) {
      T t = iterator.next();
      System.out.println(t.toString());
    }
  }

  /*public static <T extends Shape> void print(T[] shapes) {
    Group<T> group = new Group<>();
    group.addAll(shapes);
    print(group);
  }*/
  
}
