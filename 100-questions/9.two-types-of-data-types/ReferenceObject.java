// String
String myString = "Hello, world!";

// Arrays
int[] myIntArray = {1, 2, 3, 4, 5};
String[] myStringArray = {"apple", "banana", "orange"};

// Classes
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Person myPerson = new Person("John", 30);

// Interfaces
public interface Drawable {
    void draw();
}

public class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

Circle myCircle = new Circle();
myCircle.draw();

// Enumerations
enum Color {
    RED, GREEN, BLUE;
}

Color myColor = Color.RED;
System.out.println(myColor);  // Output: RED
