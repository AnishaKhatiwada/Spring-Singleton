package com.example.springbean.bean;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
@Scope(value = "prototype")
public class SingletonBean {

    private int a;
    private int b;

}
