package Adapter;

public class Usb implements IUsb {
    @Override
    public void readData() {
        System.out.println("Usb адаптер подключён");
    }
}
