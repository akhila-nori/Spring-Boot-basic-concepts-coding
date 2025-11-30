package com.codingshuttle.akhila.module1Introduction.implementation;

import com.codingshuttle.akhila.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotif")
//@ConditionalOnProperty(name="notification.type" , havingValue="sms")
public class SmsNotificationService implements NotificationService {


    @Override
    public void send(String message) {
        System.out.println("Sms sending ......."+message);
    }
}
