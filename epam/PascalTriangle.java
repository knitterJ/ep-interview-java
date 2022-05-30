// This method should draw Pascal Triangle. How to construct it?
// Topmost row has one element, ...
public class PascalTriangle {

  public static void pascalTriangle(int numberOfRows){
     int[] previousRow = new int[]{1};
     for (int row = 1; row < numberOfRows; row++){
       for(int col = 0; col <= row; col++){
         int[] actualRow = new int[row+1];
         if(col == 0 || col == row){
           previousRow = actualRow;
         }
        }
      }
    System.out.println(Arrays.toString(actualRow));
      
}
  public static void main (String args[]){
    System.out.println(pascalTriangle(12));
  }
}
