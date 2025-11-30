package com.codingshuttle.akhila.module1Introduction;

import com.codingshuttle.akhila.module1Introduction.implementation.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

    //I WANT TO INJECT all implementation class beans (both class beans)
    @Autowired //this annotation tells Spring to look though its entire Application Context
    Map<String, NotificationService> notificationServiceMap = new HashMap<>(); //spring automatically collects every single bean that implements the interface


    public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    public void run(String... args) throws Exception{
        for(var ns:notificationServiceMap.entrySet()){
            System.out.println(ns.getKey()); //key is - Bean name in the spring container
            ns.getValue().send("Hello"); //value is - actual bean instance ie., EmailNotificationService object / SmsNotificationServiceObject EXECUTES send() method on that specific service instance
        }

    }


}
