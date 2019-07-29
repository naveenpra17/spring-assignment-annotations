package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    ApplicationContext applicationContext;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    @Override
    public void afterPropertiesSet() throws Exception {//called automatically after bean is created
        System.out.println("bean initi  alised "+message);
    }
    @Override
    public void destroy() throws Exception {  //called automatically after bean is destroyed
        System.out.println("beans destroyyed");
    }
    @PostConstruct
    public void customInit(){ //custom init method

        System.out.println("this is a custom message");
    }
        @PreDestroy
        public void customDestroy(){  //custom destroy method
      System.out.println("custome cleanup");
    }


}
