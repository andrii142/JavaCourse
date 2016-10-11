package module8.webinar.generics;

public class GenericMethodExample {

   private static <T> void printArray(T[] inputArray) {
      for(T element : inputArray) {
         System.out.print(element + " ");
      }
      System.out.println();
   }

 /*  public void calculateKeys(Map<String, ?> ms) {
      //
   }
   public void calculateKeysAnother(Map<String, ? extends Comparable> ms) {
      //
   }*/

   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      printArray(intArray);   // pass an Integer array
      printArray(doubleArray);   // pass a Double array
      printArray(charArray);   // pass a Character array
   }
}