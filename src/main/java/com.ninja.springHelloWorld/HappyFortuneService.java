package com.ninja.springHelloWorld;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    public String getFortune() {
        return "A great day is ahead";
    }
}
