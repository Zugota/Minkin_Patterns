package factory;

public class CoffeeChoosing {
    public ICoffee getCoffee(CoffeeType type) {
        ICoffee coffee;
        switch (type) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default:
                throw new IllegalArgumentException("Invalid coffee type!");
        }
        return coffee;
    }
}
