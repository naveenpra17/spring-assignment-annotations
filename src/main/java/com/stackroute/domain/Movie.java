package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("movieComponent")
public class Movie implements ApplicationContextAware,BeanFactoryAware,BeanNameAware {
   ApplicationContext  applicationContext=null;
   BeanFactory beanFactory=null;

    @Autowired
    private Actor actor;
//    private String movieName;

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
//        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String s) {
//        System.out.println(s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext= applicationContext;
        Movie movie=applicationContext.getBean(Movie.class);
//        System.out.println(movie);
    }
}
