//Create a method to reverse a string using recursive solution.
// pickles -> selkcip
// jacob -> bocaj

public class ReverseStr{

  public static String reverseStr(String str){
    String result = str;

    //last character of str
    System.out.println(str.charAt(str.length()-1));

    //All the characters in str apart from the last one
    System.out.println(str.substring(0,str.length()-1));

    if(str.length() > 1) {
    // Store the last character of str and call function again, while passing the string without the last character. IT GOES ON AND ON IN A RECURSIVE WAY.
    result = str.charAt(str.length()-1) + reverseStr(str.substring(0,str.length()-1));
    }
    return result;
  }

  public static void main (String args[]){
      System.out.println(reverseStr("bla"));
  }
}

// What happens if you remove "-1" from:
// result = str.charAt(str.length()-1) + reverseStr(str.substring(0,str.length()-1));
// Exactly this way:
// result = str.charAt(str.length()-1) + reverseStr(str.substring(0,str.length()));
// ?
