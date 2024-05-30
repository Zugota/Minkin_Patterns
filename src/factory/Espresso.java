package factory;

public class Espresso implements ICoffee {
    @Override
    public void makeCoffee() {
        System.out.println("Making an Espresso");
    }
}
