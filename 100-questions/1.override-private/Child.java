//Can you override private method in Java?
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
  }
}
