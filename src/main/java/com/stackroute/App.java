package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Movie movie=applicationContext.getBean(Movie.class);
        System.out.println(movie);






















////        Movie movie = applicationContext.getBean("movie", Movie.class);//For the Movie bean, use constructor based object injection in the bean definition file(beans.xml) to inject an Actor bean.
////
//////        System.out.println(movie);//printinh actor info using movie bean
////        Movie movie1=applicationContext.getBean("movie",Movie.class);//Same bean
//////        System.out.println(movie1);
////
//////        System.out.println(movie==movie1);//both are of same beans heance reeturns true
////
////        //Chaning the scope of the Movie bean in beans.xml to prototype
////        Movie movie2=applicationContext.getBean("movie1",Movie.class);
////        Movie movie3=applicationContext.getBean("movie1",Movie.class);
//////        System.out.println(movie2==movie3);
//
////          System.out.println(movie6);
////        BeanLifecycleDemoBean beanLifecycleDemoBean=applicationContext.getBean("beanLifeCycle",BeanLifecycleDemoBean.class);
////        System.out.println(beanLifecycleDemoBean);
////        ((ConfigurableApplicationContext)applicationContext).close();
//
//        BeanPostProcessorDemoBean beanPostProcessorDemoBean=applicationContext.getBean("beanPostProcessor",BeanPostProcessorDemoBean.class);
    }
}
