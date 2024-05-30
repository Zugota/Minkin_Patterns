package factory;

public class CoffeeMaking {
    public void making(CoffeeType coffeeType) {
        CoffeeChoosing coffeeChoosing = new CoffeeChoosing();
        ICoffee coffee = coffeeChoosing.getCoffee(coffeeType);
        coffee.makeCoffee();
    }
}