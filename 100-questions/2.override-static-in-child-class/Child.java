public class Child extends Base {

  public static void nothingSpecialMethod() {
    System.out.println("or maybe you, Mrs Child method?");
  }

  public static void main(String[] args) {

    nothingSpecialMethod();

    //still possible to invoke the method from the base class:
    // Base stdObj = new Child();
    // stdObj.nothingSpecialMethod();

  }
}
