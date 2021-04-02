package myAspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut("execution(* service.MyService.test()) || execution(* service.MyService2.test())")
    public void wrap(){

    }

    @Before("wrap()")
    public void beforeWrap(){
        System.out.println("Aspect: before wrap");
    }

    @After("wrap()")
    public void afterWrap(){
        System.out.println("Aspect: after wrap");
    }
}
