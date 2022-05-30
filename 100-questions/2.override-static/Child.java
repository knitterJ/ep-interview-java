//remember that oveRRide happens within two classes
public class Child extends Base {

  public void nothingSpecialMethod() {
    System.out.println("Yes! We made that ass pass! - you've just been overriden");
  }
  private void impossiblePart() {
    System.out.println("to je amelinum!");
  }


  public static void main(String[] args) {
    Base stdObj = new Child();
    stdObj.nothingSpecialMethod();

    // error: impossiblePart() has private access in Base
    // stdObj.impossiblePart();

    //Calling method this way also won't work! You'd have to use Java reflection in order to get to this method from Child class
    // Base noOtherChoiceObj = new Base();
    // noOtherChoiceObj.impossiblePart();

  }
}
