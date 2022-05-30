//Based on the Scanner Class, ask user for amount of candidates,
//Then, user is able to write their surnames line by line,
//As the final output, program prints out "Hello Mr/Mrs" + candidatesName
//The amount of candidates should be at least two.

// INPUT:
// 2
// Bruce
// Williams
//
// OUTPUT:
// Hello, Bruce
// Hello, Williams

import java.util.Scanner;
public class ScannerMultipleStringInputs {

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    int amountOfCandidates = scanner.nextInt();

    //0. Line break that needs to be interpreted. Otherwise blank value between integer and first string appears.
    scanner.nextLine();

    //1. Create a String object that will store the list of candidates
    String[] arrayStringOfCandidates = new String[amountOfCandidates];

    //2. Read values of candidates (fills up arrayStringOfCandidates)
    for (int i = 0; i < arrayStringOfCandidates.length; i++) {
      arrayStringOfCandidates[i] = scanner.nextLine();
    }

    //3. Display values of candidates
    for (String candidatesName: arrayStringOfCandidates) {
      System.out.println("Hello, " + candidatesName);
    }

  }
}
