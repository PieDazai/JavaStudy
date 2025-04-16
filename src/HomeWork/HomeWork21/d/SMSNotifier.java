package HomeWork.HomeWork21.d;

public class SMSNotifier implements  Notifier{

    @Override
    public void send(String recipient, String message) {
        System.out.println("СМС: " + message);
    }
}
