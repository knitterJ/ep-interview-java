// Return the sum of even numbers.
// If given array is null or empty, method returns 0.

import java.util.Arrays;
public class SumEvenIfNotNull {

  public static void main(String[] args) {

    //Is this actually correct?
    int[] nullArray = null;
    // Once the int array is initialized in a different way:
    // int arrayInt[] = new int[10];
    // the array is filled up with zeros by default. Only reference types are filled up with null's by default:
    // String arrayString[] = new String[10];
    // System.out.println(Arrays.toString(nullArray));
    // System.out.println(Arrays.toString(arrayInt));
    // System.out.println(Arrays.toString(arrayString));

    System.out.println(sum(nullArray));
  }

  public static int sum(int[] array) {
    int sum = 0;
    if (array == null || array.length == 0) {
      return 0;
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        sum += array[i];
      }
    }
    return sum;
  }
}
