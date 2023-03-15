public class Car extends Vehicle {
    public void start() {
        System.out.println("Car started.");
    }
    public static void main(String[] args){
            Car car = new Car();
            car.start();
    }
}
  
