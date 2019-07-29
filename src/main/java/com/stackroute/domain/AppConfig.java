package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class AppConfig {

    @Bean
    public Actor getActor(){
        Actor actor=new Actor();
        actor.setActor("naveen");
        actor.setGender("male");
        actor.setAge(17);
        return actor;
    }


}

