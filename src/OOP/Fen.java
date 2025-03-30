package OOP;

public class Fen implements DevicesTurn{

    @Override
    public void turnOn() {
        System.out.println("Фен включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Фен выключен");
    }
}
