public class DivagationAboutStaticFinal {

  // Let's see how variables behave with "final", "static" and "static final" keywords:

  //1.1. If accountId is marked final, each individual account can have its own unique value. The only rule is that once the value is assigned to the instance variable, it can never be changed.
  final int accountId;

  //1.2. Not-final and static variable means that any instance can change the value. As static value is not dependent on ANY instances, changing the value affects all the instances!
  static double rate = 1.5;

  //1.3. When you introduce static final field, its value has to be initialized immediately. Otherwise combination of static and final keywords yield error.
  final static int odLimit = 1000;
  /* when trying:
  static final int odLimit;
  There's an error: variable odLimit might not have been initialized. */

  public DivagationAboutStaticFinal(int id) {
    this.accountId = id;
  }

  public static void main(String[] args) {

    //1.1. Variable that is final, but not static, has to be initialized by a constructor of the object and it has constant value for this particular object. But for different objects, variable can still have different values. That's why it is not constant in a strict sense.
    DivagationAboutStaticFinal first = new DivagationAboutStaticFinal(123);
    DivagationAboutStaticFinal second = new DivagationAboutStaticFinal(456);

    // The following prints out 123
    System.out.println(first.accountId);
    // The following prints out 456
    System.out.println(second.accountId);

    /* and this line...
    first.accountId = 789;
    would result with compile error, as the value can't be changed anymore */

    // 1.2. Now, let's try to change the value of variable called "rate" that was defined in the class as: static double rate = 1.5;
    rate = 3.5;
    System.out.println(rate);
    // As we can see, there's no problem with the operation.

    // Now, for the experiment purposes, let's try to refer to the rate by any instance of the class
    System.out.println(first.rate);
    //It's possible, BUT YIELDS WARNING: static variable should be qualified by type name DivagationAboutStaticFinal
    //The rate doesn't belong to any instance of the DivagationAboutStaticFinal class, so we can refer to the "rate" by the class:
    System.out.println(DivagationAboutStaticFinal.rate);

    //Interestingly, it's even possible to change the static value of the variable "rate", by refering to the instance of the class:
    first.rate = 2.5;
    System.out.println("Once the value of the rate has changed by refering to the first.rate, the change affected global state of the variable rate. second.rate equals " + second.rate);


    /* 1.2.Changing the value of "final static int odLimit = 1000;" would result with compilation error.
    Static in combination with final will make the variable decoupled from any instance. In other words, variable will belong to the class, but at the same time it might be refered by the instance of the class.
    When you combine static final in Java, you create a variable that is global to the class, impossible to change, and has to be initialized immediately.
    It's amazing that these two keywords are complimentary.
    The STATIC FINAL keywords used together eliminate the need to use CONST keyword.*/

    /*FAQ AND QUESTIONS
    ----------------
    Why final is not enough to make variable not changeable? From the perspective of the above train of thoughts, FINAL keyword should be enough. Why we also need to decouple variable from any instances by using STATIC keyword?
    YES! BECAUSE variable that is final, but not static has a constant value for one object, meaning that it can only be modified by a constructor of that object. But for different objects the variable can still have different values. That's why it is not a constant in a strict sense.*/
  }
}
