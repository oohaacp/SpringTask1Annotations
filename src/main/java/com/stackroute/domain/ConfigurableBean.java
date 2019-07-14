package com.stackroute.domain;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurableBean
{
    @Bean(name = "actor")
    public Actor getActor()
    {
        return new Actor("Prabhas","Male",40);
    }
    @Bean(name="movie")
    public Movie getMovie()
    {
        return new Movie();
    }
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifeCycleDemoBean setBeanlifeCycleobject()
    {
        return new BeanLifeCycleDemoBean();
    }
    @Bean
    public BeanPostProcessorDemoBean setBeanPostProcessorDemoBean()
    {
        return new BeanPostProcessorDemoBean();
    }

}
