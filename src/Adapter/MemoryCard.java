package Adapter;

public class MemoryCard implements IMemoryCard {
    @Override
    public void readData() {
        System.out.println("Карта памяти подключена");
    }
}
