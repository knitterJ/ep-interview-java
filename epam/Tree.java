//A tree has two cycles of growth every year. First growth happens during the spring, when it doubles its height. The second one occurs during the summer when its height increases by 1 meter. The tree is planted on the beginning of spring and it's initial height is 1 meter. Find the height of the tree after N cycles of growth.

public class Tree {

  public static long calculateHeight(int numberOfCycles){
     int height = 1;
     for(int i = 1; i <= numberOfCycles; i++){

       // summer (even)
       if (i % 2 == 0) {
         height++;

       // spring
       } else {
         height *= 2;
       }
     }
     return height;
  }

  public static void main (String args[]){
      System.out.println(calculateHeight(4)); // four cycles - the tree double its height (2), grows a meter (3), again doubles (6), and in the end grows one more meter (7) 
  }
}
