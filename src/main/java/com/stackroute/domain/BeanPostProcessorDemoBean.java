package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    @Override //this method will be executed afterbean initilaition
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after initialization"+beanName);
        return bean;
    }

    @Override//this method will be executed after eanndestroyed
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before initialization"+beanName);
        return bean;
    }
}
