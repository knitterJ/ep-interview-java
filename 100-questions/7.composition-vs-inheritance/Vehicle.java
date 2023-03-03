// In this example, the Engine class represents an engine with a type field and start() and stop() methods. The Vehicle class represents a vehicle with a make and model field, and drive() and stop() methods. The Car class extends the Vehicle class and adds an Engine object as a field. The Car class also has startEngine() and stopEngine() methods that delegate to the start() and stop() methods of the Engine object, respectively. In the main() method, we create a new Engine object with a type of "V6", and then create a new Car object with the make of "Toyota", model of "Camry", and the Engine object. We call the startEngine() method of the Car object, which delegates to the start() method of the Engine object, printing "Starting V6 engine...". We then call the drive() and stop() methods of the Car object, which respectively print "Driving the Toyota Camry" and "Stopping the Toyota Camry". Finally, we call the stopEngine() method of the Car object, which delegates to the stop() method of the Engine object, printing "Stopping V6 engine...". Here, the Car class uses composition to include an Engine object, and uses inheritance to extend the functionality of the Vehicle class.

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Starting " + type + " engine...");
    }

    public void stop() {
        System.out.println("Stopping " + type + " engine...");
    }
}

public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving the " + make + " " + model);
    }

    public void stop() {
        System.out.println("Stopping the " + make + " " + model);
    }
}

public class Car extends Vehicle {
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        super(make, model);
        this.engine = engine;
    }

    // This is composition: the Car class has an Engine object as a field
    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }
}

public static void main(String[] args) {
    Engine engine1 = new Engine("V6");
    Car car1 = new Car("Toyota", "Camry", engine1);

    car1.startEngine();
    car1.drive();
    car1.stop();
    car1.stopEngine();
}
