package com.codingshuttle.akhila.module1Introduction.implementation;

import com.codingshuttle.akhila.module1Introduction.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email sending ......."+message);
    }
}
