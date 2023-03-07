public class Main {

  public static void main(String[] args){

    String str1 = "hello";
    String str2 = "hello";

    System.out.println(str1 == str2);
    // true, both references indicate the same object in the memory
    // Obie referencje wskazują na ten sam obiekt w String Pool'u (String intering)

    // Ale obiekt typu String możemy utworzyć także w inny sposób. To znaczy w taki sposób, że nie znajdzie się on w StringPool'u a na tak zwanym stosie.
    String myString = new String("hello");

    // Wówczas także referencja jest inna
    System.out.println(myString == str2); // false


    //--------------------
    // A jak sprawa ma się w przypadku typów prymitywnych?

    int two = 2;
    int two2 = 2;
    System.out.println(two == two2); // true
    // Primitive data types, such as int, double, and boolean, hold the actual values of the data they represent, instead of references to memory locations.

    System.out.println(two.equals(two2)); // int cannot be dereferenced
  }
}
