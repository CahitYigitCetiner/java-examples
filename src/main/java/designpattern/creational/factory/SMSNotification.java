package designpattern.creational.factory;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("send SMS");
    }
}
