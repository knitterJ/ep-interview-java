// Remove elements that are bigger that any of its neighbour elements.

// INPUT:
// [18, 1, 3, 6, 7, -5]
//
// OUTPUT:
// [1, 3, 6, -5]

import java.util.Arrays;

public class RemoveLocalMaxs {

  public static void main(String[] args) {
      int[] array = new int[]{18, 1, 3, 6, 7, -5};

      System.out.println(Arrays.toString(removeLocalMaxima(array)));
  }

  private static int addElementToArray(int[] array, int position, int value) {
      array[position] = value;
      return ++position;
  }

  public static int[] removeLocalMaxima(int[] values) {
      if (values == null || values.length < 1)
          throw new IllegalArgumentException("Illegal argument exception input parameter is null or length less than 1");
      int[] rets = new int[values.length];
      int pos = 0;
      for (int i = 0; i < values.length; i++) {
          if (i == 0) {
              if (values[i] <= values[i + 1])
                  pos = addElementToArray(rets, pos, values[i]);
          } else if (i <= values.length - 2) {
              if (values[i] <= values[i + 1] || values[i] <= values[i - 1])
                  pos = addElementToArray(rets, pos, values[i]);
          } else if (i == values.length - 1) {
              if (values[i] <= values[i - 1])
                  pos = addElementToArray(rets, pos, values[i]);
          }
      }
      return java.util.Arrays.copyOf(rets, pos);
  }
  }
