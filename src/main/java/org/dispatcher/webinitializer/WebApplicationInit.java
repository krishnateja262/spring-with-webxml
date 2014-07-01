///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package org.spring.learn.webinitializer;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
///**
// *
// * @author krishna
// */
//public class WebApplicationInit implements WebApplicationInitializer{
//
//    public void onStartup(ServletContext sc) throws ServletException {
//        WebApplicationContext applicationContext = getContext();
//        sc.addListener(new ContextLoaderListener(applicationContext));
//        ServletRegistration.Dynamic dispatcher = sc.addServlet("DispatcherServlet", new DispatcherServlet(applicationContext));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping("/*");
//    }
//
//    private WebApplicationContext getContext() {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.setConfigLocation("org.spring.learn.config");
//        return context;
//    }
//    
//}
