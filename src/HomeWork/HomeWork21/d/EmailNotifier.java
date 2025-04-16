package HomeWork.HomeWork21.d;

class EmailNotifier implements Notifier {

    @Override
   public void send(String recipient, String message) {
        System.out.println("Email: " + message);
    }

}