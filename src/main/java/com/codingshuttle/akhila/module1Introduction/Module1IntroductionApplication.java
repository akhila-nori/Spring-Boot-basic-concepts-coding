package com.codingshuttle.akhila.module1Introduction;

import com.codingshuttle.akhila.module1Introduction.implementation.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

//    @Autowired
    NotificationService notificationServiceObj; //dependency injection -- DECLARED IT

    public Module1IntroductionApplication(@Qualifier("emailNotif") NotificationService notificationServiceObj) {
        //in a way Module1IntroductionApplication class is dependent upon NotificationService class
        //notificationServiceObj this object is injected by dependency injection framework


        this.notificationServiceObj = notificationServiceObj; //INITIALIZED IT .... constructor dependency injection --> the preferred way of doing dependency injection
        //we are initiaising this object
    }

    public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    public void run(String... args) throws Exception{
       notificationServiceObj.send("Helo");

       this.notificationServiceObj = null;
    }


}
