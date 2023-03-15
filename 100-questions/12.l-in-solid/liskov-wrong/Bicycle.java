// Gdybyśmy w klasie Bicycle zdecydowali się na zmianę zachowania metody start() to w takiej sytuacji hierarchia dziedziczenia nie spełniałaby już zasady podstawiania Liskov, ponieważ metoda start() rzucałaby wyjątek zamiast uruchamiać pojazd. Metoda start() ma zwracać taki sam typ (mieć takie samo zachowanie), jak start() w klasie bazowej. 

public class Bicycle extends Vehicle {
  public void start() {
      throw new UnsupportedOperationException("Bicycles cannot be started like a car.");
  }
    public static void main(String[] args){
        Bicycle bike = new Bicycle();
        bike.start();
    }
}
