public class Bicycle extends Vehicle {
    public void start() {
        System.out.println("Bicycle started.");
    }
    public static void main(String[] args){
        Bicycle bike = new Bicycle();
        bike.start();
    }
}
