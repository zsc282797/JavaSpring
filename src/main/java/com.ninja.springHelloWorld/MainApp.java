package com.ninja.springHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainApp {
//    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext
//                (".xml");
//
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        MikeHello mhobj = (MikeHello) context.getBean("helloMike");
//        obj.getMessage();
//        System.out.println(mhobj.getInfo());
//
//    }
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("ContextScan.xml");
        Annotated ant = (Annotated) context.getBean("basicAnnotated");

        System.out.println(ant.getContent());
        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
        hw.getMessage();

    }
}