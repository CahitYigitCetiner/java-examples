package designpattern.creational.factory.main;

import designpattern.creational.factory.Notification;
import designpattern.creational.factory.NotificationFactory;

public class FactoryPatternMain {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification = notificationFactory.createNotification("SMS");
        Notification notification1 = notificationFactory.createNotification("EMAIL");
        Notification notification2 = notificationFactory.createNotification("PUSH");

        notification.notifyUser();
        notification1.notifyUser();
        notification2.notifyUser();
    }
}
