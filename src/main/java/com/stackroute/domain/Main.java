package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String args[]) {
        //use ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurableBean.class);
        Movie movie1 = context.getBean(Movie.class);
        movie1.display();

        //use BeanFactory
        BeanFactory factory = new AnnotationConfigApplicationContext(ConfigurableBean.class);
        Movie movie2 = factory.getBean(Movie.class);
        movie2.display();

    }
}