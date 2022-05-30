public class DivagationAboutStaticFinal {

  //1.1. If accountId is marked final, each individual account can have its own unique value. The only rule is that once the value is assigned to the instance variable, it can never be changed.
  final int accountId;

  //1.2. Not-final and static variable means that any instance can change the value. As static value is not dependent on ANY instances the change in value affects all the instances!
  static double rate = 1.5;

  //1.3. error: variable odLimit might not have been initialized
  // static final int odLimit;
  final static int odLimit = 1000;

  public DivagationAboutStaticFinal(int id) {
    this.accountId = id;
  }

  public static void main(String[] args) {

    // variable that is final, but not static has a constant value for one object, meaning that it can only be modified by a constructor of that object. But for different objects the variable can still have different values. That's why it is not a constant in a strict sense.
    DivagationAboutStaticFinal first = new DivagationAboutStaticFinal(123);
    DivagationAboutStaticFinal second = new DivagationAboutStaticFinal(456);

    // The following prints 123
    System.out.println(first.accountId);
    // The following prints 456
    System.out.println(second.accountId);

    // 1.1. Next line triggers a compile error
    // first.accountId = 789;

    rate = 3.5;
    System.out.println(rate);

    //POSSIBLE BUT YIELDS WARNING: static variable should be qualified by type name Account
    System.out.println(first.rate);
    //Obviously, as the rate doesn't "belong" to any instance of the Account class. So should be:
    System.out.println(DivagationAboutStaticFinal.rate);

    //Interesting that it's even possible to change the static value of the variable "rate", by refering to the instance of the class (Instances in Java are known as Objects, so I should call it "first" Object)

    first.rate = 2.5;
    System.out.println(second.rate);
    System.out.println(DivagationAboutStaticFinal.rate);

    //So in conclusion, static in combination with final will make the variable:

    // Decoupled from any instance. In other words, variable will belong to the class, but at the same time it might be refered by the instance of the class. (STATIC KEYWORD)

    System.out.println(first.odLimit);

    // Once the value is initialized it is not changeable by any means. But at the same time, each instance can have unique value. (FINAL KEYWORD )
    // 1.3. The value has to be initialized "immediately". Otherwise final yields error

    // When you combine static final in Java, you create a variable that is global to the class and impossible to change.
    // It's amazing that these two keywords are complimentary.
    // The STATIC FINAL keywords used together eliminate the need to use CONST keyword.

    //FAQ AND QUESTIONS
    //----------------
    //Why final is not enough to make variable not changeable? From the perspective of the above train of thoughts, FINAL keyword should be enough. Why we also need to decouple variable from any instances by using STATIC keyword?

    //YES! BECAUSE variable that is final, but not static has a constant value for one object, meaning that it can only be modified by a constructor of that object. But for different objects the variable can still have different values. That's why it is not a constant in a strict sense.

  }
}
