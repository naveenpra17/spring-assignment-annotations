package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
//import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Configuration

@ComponentScan(basePackages = "com.stackroute.domain")
public class AppConfig {


    @Bean
    public Actor actor() {
        Actor actor1 = new Actor("naveen", "male", 17);
        return actor1;
    }

    @Bean
    public Actor actorBean1() {
        Actor actor2 = new Actor("naveenpra", "male", 27);
        return actor2;
    }

   @Bean(name="beanLifecycleDemoBean")
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
   {
       BeanLifecycleDemoBean bean=new BeanLifecycleDemoBean();
   return bean;
   }

    @Bean(name="beanPostProcessorDemoBean")
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean(){
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=new BeanPostProcessorDemoBean();
        return beanPostProcessorDemoBean;
    }

















            //task2-annotation
//    @Bean(name = "movie1")
//    public Movie name() {
//        Actor actor = new Actor("cr7", "male", 19);
//        Movie movie = new Movie(actor);
//        return movie;
//    }
//
//    @Bean(name = "movie2")
//    public Movie name1() {
//        Actor actor2 = new Actor();
//        actor2.setAge(17);
//        actor2.setGender("male");
//        actor2.setActor("prakash");
//        Movie movie=new Movie(actor2);
//        return movie;
//    }
//
//    @Bean(name = {"movie3","movie4"})
//    @Scope("prototype")
//    public Movie name2() {
//        Actor actor3 = new Actor();
//        actor3.setActor("naveen");
//        actor3.setGender("male");
//        Movie movie=new Movie(actor3);
//        return movie;
    }








