package com.stackroute.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {
        //use ApplicationContext
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurableBean.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        movie1.display();
        Movie movie2=context.getBean("movie2",Movie.class);
        movie2.display();
        Movie movie3=context.getBean("movie3",Movie.class);
        movie3.display();
        Movie movie4=context.getBean("movie4",Movie.class);
        movie4.display();
        System.out.println("Beans are in same scope : "+(movie1==movie3));


    }
}
