package com.codingshuttle.akhila.module1Introduction.implementation;

import com.codingshuttle.akhila.module1Introduction.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {


    @Override
    public void send(String message) {
        System.out.println("Sms sending ......."+message);
    }
}
