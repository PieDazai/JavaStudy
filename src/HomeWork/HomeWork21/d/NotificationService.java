package HomeWork.HomeWork21.d;

class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    void sendNotification(String recipient, String message) {
            notifier.send(recipient, message);
    }
}
