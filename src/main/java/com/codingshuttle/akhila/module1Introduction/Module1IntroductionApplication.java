package com.codingshuttle.akhila.module1Introduction;

import com.codingshuttle.akhila.module1Introduction.implementation.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    public void run(String... args) throws Exception{
       NotificationService notificationServiceObj = new EmailNotificationService();
       notificationServiceObj.send("Helo");
    }


}
