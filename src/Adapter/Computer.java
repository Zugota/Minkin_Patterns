package Adapter;

public class Computer {
    public void connectToPC(IUsb iusb) {
        iusb.readData();
        System.out.println("Успешно подключён к компьютеру");
    }
}
