import configuration.MySpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MyService;
import service.MyService2;

public class SpringApplication {
    public static void main (String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfiguration.class);
        MyService service = (MyService) context.getBean("myService");
        MyService2 service2 = (MyService2) context.getBean("myService2");
        service.test();
        service2.test();
    }
}
