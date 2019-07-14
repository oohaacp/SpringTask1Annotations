package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigurableBean {
    @Bean
    public Movie movieBean()
    {
        Movie mov=new Movie();
        mov.setActor(actorBean());
        return mov;
    }
    @Bean
    public Actor actorBean()
    {
        return new Actor();

    }

}
