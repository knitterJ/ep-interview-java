// The method draws PascalTriangle
// The key component to understand the following code is to decouple first element from the rest of the triangle construction.
// The top element is out of the pattern, how next rows and columns are build. This fact has the key importance how program iterates through rows and columns.
// [1]
// ---------
// This is the first row and zero, one column [1,1]
// This is the second row and zero, one, two columns [1,2,2]
// This is the third row and zero, one, two, three columns [1,3,3,1]
// [1,4,6,4,1]
// and so on...
// If it's still not clear, please turn to: https://www.youtube.com/watch?v=icoql2WKmbA&ab_channel=NickWhite

import java.util.Arrays;

public class PascalTriangle {

  public static void pascalTriangle(int numberOfRows) {

    // initialize first triangle's (top) item with one.
    System.out.println("[1]");

    // Just to initialize previousRow variable - The dimension of the array i.e. {1} could be anything. So int[] previousRow = new int[] {}; or  int[] previousRow = new int[] {2022}; would work as well.
    int[] previousRow = new int[] {1};

    for (int row = 1; row < numberOfRows; row++) {

      // initialize actualRow variable. [row + 1] indicates the amount of the elements, that we need in each row. Try out what happens if you change to: int[] actualRow = new int[row + 13];
      int[] actualRow = new int[row + 1];

      for (int col = 0; col <= row; col++) {

        //if the carret points out to the EDGES of the triangle (0 index of the column or ), assign value 1
        if (col == 0 || col == row) {
          actualRow[col] = 1;

          //else calculate the inner values of each array. The calculation takes a value above actualRow and a value, which is one value before the previosly mentioned
        } else {
          actualRow[col] = +previousRow[col] + previousRow[col - 1];
        }
      }
      System.out.println(Arrays.toString(actualRow));

      //After consuming actualRow array, it becomes new previousRow
      previousRow = actualRow;
    }
  }
  public static void main(String args[]) {
    pascalTriangle(5);
  }
}
