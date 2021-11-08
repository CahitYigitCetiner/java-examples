package designpattern.creational.factory;

public class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("send push notification");
    }
}
