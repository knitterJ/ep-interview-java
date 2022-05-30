//return an array of booleans where each element is a result of a check if a corresponding element is a sum of two previous elements in given array.

// INPUT:
// [1, -1, 0, 4, 6, 10, 15, 25]
//
// OUTPUT:
// [false, false, true, false, false, true, false, true]
import java.util.Arrays;

public class ThreeConsequitiveElementsInArray {

      public static void main(String[] args) {
          int[] array = new int[] {1, -1, 0, 4, 6, 10, 15, 25};

          System.out.println(Arrays.toString(getSumCheckArray(array)));
      }
      public static boolean[] getSumCheckArray(int[] array) {
          boolean[] truthTable = new boolean[array.length];
          int sum = 0;
          for (int i = 0; i < array.length - 2; i++) {
              sum = array[i] + array[i + 1];
              if (sum == array[i + 2]) {
                  truthTable[i + 2] = true;
              }
          }
          return truthTable;
      }
  }
