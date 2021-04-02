package service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyService {
    public void test(){
        System.out.println("myservice test");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("myservice postConstruct");
    }

    public void preInit(){
        System.out.println("myservice preInit");
    }
}
