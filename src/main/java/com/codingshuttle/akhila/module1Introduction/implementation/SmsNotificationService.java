package com.codingshuttle.akhila.module1Introduction.implementation;

import com.codingshuttle.akhila.module1Introduction.NotificationService;

public class SmsNotificationService implements NotificationService {


    @Override
    public void send(String message) {
        System.out.println("Sms sending ......."+message);
    }
}
