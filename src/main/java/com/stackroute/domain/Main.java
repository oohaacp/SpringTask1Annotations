package com.stackroute.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {
        //use ApplicationContext
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurableBean.class);
        Movie movie1=context.getBean("movie",Movie.class);
        movie1.display();

    }
}