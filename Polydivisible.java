//Properties of polydivisible number:
// The first digit is not ZERO
// First two digits are divisible by TWO
// First three digits are divisible by THREE
// First four digits are divisible by FOUR .. and so on
// Check whether the passed number is polydivisible
public class Polydivisible {

public static boolean polydivisible(int number ){

  //1. Count the amount of digits (candidatesLength of the number).
  // Auxiliary variable that counts amount of DOZENS
  int toCountLength = number;
  int candidatesLength = 0;
  while(toCountLength != 0){
    toCountLength/=10;
    candidatesLength++;
    // System.out.println(toCountLength);
  }
  // System.out.println(candidatesLength);
  // Could be also done by String str = Integer.toString(number); int candidatesLength = str.candidatesLength();


  //2. The idea is to divide (%) THE NUMBER by it's LENGHT
  //333 -> 333%3 -> true -> 33%2 -> false -> end of operation
  //if(number%candidatesLength) operation yields FALSE -> flag divisionMustGoOn switches to false -> iteration stops and we return false
  //Otherwise, the test has passed -> divisionMustGoOn stays as it was in the first place -> return true

  boolean divisionMustGoOn = true;
  while(number != 0 && divisionMustGoOn){
    if(number%candidatesLength != 0){
      divisionMustGoOn=false;
    }
    number/=10;
    candidatesLength--;
  }
  return divisionMustGoOn;
}

  public static void main (String args[]){
      System.out.println(polydivisible(2220301));
      //remember that the range of int type varies between -2147483648 to 2147483647 (2^31)

  }
}
