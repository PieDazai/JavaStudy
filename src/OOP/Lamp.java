package OOP;

public class Lamp implements DevicesTurn{
    @Override
    public void turnOn() {
        System.out.println("Лампа включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Лампа выключена");
    }
}
