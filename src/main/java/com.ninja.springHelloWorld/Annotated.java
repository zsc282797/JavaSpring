package com.ninja.springHelloWorld;

import org.springframework.stereotype.Component;

@Component("basicAnnotated")
public class Annotated {
    private String content;
    public Annotated(){
        this.content = "This is a field that need to be set";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
