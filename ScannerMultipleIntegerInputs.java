// Write a program, which finds maximum value in the set of given numbers.
// Based on the Scanner class, ask user to pass several (at least one) integer values.
// Once the user is done, he's able to enter 0 (which is not taken into account in finding max value), which means end of the input in sequence.
// INPUT:
// 2
// 6
// 90
// 0

// OUTPUT:
// The max number in this sequence is 90.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ScannerMultipleIntegerInputs {
  public static int max() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the program that finds maximum value over the numbers that you pass. Press any key to start");
    String key = scanner.nextLine();
    System.out.println("Enter the sequence of numbers. Confirm each one with ENTER. After you're done enter zero and confirm once again with ENTER (obviously last zero won't be taken into account when looking for the biggest value)");

    ArrayList < Integer > numbers = new ArrayList < Integer > ();
    boolean go = true;
    while (go) {
      int value = scanner.nextInt();
      numbers.add(value);
      if (value == 0) {
        go = false;
        numbers.remove(numbers.size() - 1);
      }
    }
    return Collections.max(numbers);
  }

  public static void main(String[] args) {
    System.out.println("The max number in this sequence is " + max() + ".");
  }
}
