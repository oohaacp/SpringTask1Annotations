package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean
{
    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Implementing InitializingBean");
    }
    @Override
    public void destroy() throws Exception
    {
        System.out.println("Implementing bean destroy");
    }
    public void customInit()
    {
        System.out.println("Custom Initialisation");
    }
    public void customDestroy()
    {
        System.out.println("Custom Destroy");
    }
}
