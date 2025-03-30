package OOP;

public class TV implements DevicesTurn{
    @Override
    public void turnOn() {
        System.out.println("Телевизор включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Телевизор выключен");
    }
}
