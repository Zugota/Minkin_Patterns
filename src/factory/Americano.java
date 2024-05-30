package factory;

public class Americano implements ICoffee {
    @Override
    public void makeCoffee() {
        System.out.println("Making an Americano");
    }
}
