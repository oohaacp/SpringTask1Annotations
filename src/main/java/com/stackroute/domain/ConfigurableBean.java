package com.stackroute.domain;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurableBean {
    @Bean(name={"movie1","movie2"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movieBean()
    {
        Movie mov=new Movie(actorBean1());
        return mov;
    }
    @Bean(name={"movie3","movie4"})
    public Movie movieBean1()
    {
        Movie mov=new Movie(actorBean2());
        return mov;
    }
    @Bean
    public Actor actorBean1()
    {
        return new Actor("Suresh","Male",35);
    }
    @Bean
    public Actor actorBean2()
    {
        return new Actor("Prabhas","Male",40);
    }
}