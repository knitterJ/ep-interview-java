import java.util.Scanner;
import java.util.Arrays;

public class Intersection {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(calculateIntersection()));
  }

  public static double[] calculateIntersection() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("The program calculates the point of intersection of two lines, given by their equations: ax + b. Please introduce the a and b coefficients of both lines:");

    double m1 = scanner.nextInt();
    double b1 = scanner.nextInt();
    double m2 = scanner.nextInt();
    double b2 = scanner.nextInt();

    if ((m2 - m1) == 0) {
      throw new ArithmeticException("The lines don't have intersection, because they're parallel.");
    }

    // Intersection [x,y] formula
    double crossX = (b1 - b2) / (m2 - m1);
    double crossY = (m1 * crossX + b1);

    double[] array = new double[] {crossX,crossY};
    return array;
  }
}
