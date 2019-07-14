package com.stackroute.domain;
import com.stackroute.domain.Actor;
import org.springframework.stereotype.Component;

public class Movie
{
    public Actor actor;

    public Movie(Actor actor)
    {
        this.actor = actor;
    }

    /* public void setActor(Actor actor) {
         this.actor = actor;
     }
    */ public void display()
    {
        System.out.println("Actor information : "+actor.getName()+" : gender is :" +actor.getGender()+" : age is :" +actor.getAge());
    }

}