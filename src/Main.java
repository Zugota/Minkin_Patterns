import Adapter.CardAdapter;
import Adapter.Computer;
import Adapter.MemoryCard;
import Adapter.Usb;
import Proxy.DatabaseImpl;
import Proxy.DatabaseProxy;
import Singleton.LoggerClass;
import factory.CoffeeMaking;
import factory.CoffeeType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton");
        LoggerClass loggerClass = LoggerClass.getInstance();
        loggerClass.classLog(new String("Test"), "Class1");
        loggerClass.classLog(null, "Class1");

        System.out.println("\nFactory");
        CoffeeMaking coffeeMaking = new CoffeeMaking();
        coffeeMaking.making(CoffeeType.ESPRESSO);
        coffeeMaking.making(CoffeeType.AMERICANO);

        System.out.println("\nAdapter");
        Usb usb = new Usb();
        Computer computer = new Computer();
        computer.connectToPC(usb);

        MemoryCard memoryCard = new MemoryCard();
        computer = new Computer();
        computer.connectToPC(new CardAdapter(memoryCard));

        System.out.println("\nProxy");
        String dbName = "localDB";
        DatabaseImpl database = new DatabaseImpl();
        DatabaseProxy proxy = new DatabaseProxy(database);
        System.out.println(proxy.connectToDB("localhost:8081", dbName));
        System.out.println(proxy.connectToDB("localhost:8081", dbName));
    }
}