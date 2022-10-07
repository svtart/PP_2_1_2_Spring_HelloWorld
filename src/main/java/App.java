import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat bean2 =
               applicationContext.getBean("cat", Cat.class);
        System.out.println(bean2.getMessage());

        HelloWorld bean3 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat bean4 =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(bean2.getMessage());

        Cat bean5 =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(bean2.getMessage());

        System.out.println(bean.equals(bean3));
        System.out.println(bean2.equals(bean4));



    }
}