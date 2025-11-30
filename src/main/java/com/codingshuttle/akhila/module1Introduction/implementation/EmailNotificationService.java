package com.codingshuttle.akhila.module1Introduction.implementation;

import com.codingshuttle.akhila.module1Introduction.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email sending ......."+message);
    }
}
