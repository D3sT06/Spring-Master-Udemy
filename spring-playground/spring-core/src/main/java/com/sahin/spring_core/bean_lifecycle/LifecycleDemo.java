package com.sahin.spring_core.bean_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifecycleDemo() {
        System.out.println("LIFECYCLE DEMO: Bean is constructing");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LIFECYCLE DEMO: Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("LIFECYCLE DEMO: Bean name has been set as " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LIFECYCLE DEMO: Bean is destroying");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LIFECYCLE DEMO: Bean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LIFECYCLE DEMO: Bean application context has been set");
    }

    @PostConstruct
    public void someMethod() {
        System.out.println("LIFECYCLE DEMO: PostConstruct annotated method is running");
    }

    @PreDestroy
    public void someAnotherMethod() {
        System.out.println("LIFECYCLE DEMO: PreDestroy annotated method is running");
    }

    void beforeInitialization() {
        System.out.println("LIFECYCLE DEMO: Method called by custom bean post processor is running before initialization");
    }

    void afterInitialization() {
        System.out.println("LIFECYCLE DEMO: Method called by custom bean post processor is running after initialization");
    }
}
