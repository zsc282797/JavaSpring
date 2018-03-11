package com.ninja.springHelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String message;
    private FortuneService fortuneService;
    @Autowired
    public HelloWorld (FortuneService thefortuneService){
        this.fortuneService = thefortuneService;

    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message + fortuneService.getFortune());
    }
}