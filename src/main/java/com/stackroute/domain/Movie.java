package com.stackroute.domain;
import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
{
    @Autowired
    public Actor actor;


    public Movie()
    {
    }

    public Actor getActor()
    {
        return actor;
    }

    @Autowired
    public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    public Movie(Actor actor)
    {
        this.actor = actor;
    }

    public void display()
    {
        System.out.println("Actor information : "+actor.getName()+" : gender is :" +actor.getGender()+" : age is :" +actor.getAge());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        System.out.println("Implementing BeanFactory");
    }

    @Override
    public void setBeanName(String s)
    {
        System.out.println("Implementing Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println("Implementing ApplicationContextAware");
    }
}
