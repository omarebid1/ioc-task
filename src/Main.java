import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Rectangle rectangle = container.getBean("rectangleBean", Rectangle.class);
        Circle circle = container.getBean("circleBean", Circle.class);

        System.out.println("Rectangle Area: " + rectangle.getArea(3));
        System.out.println("Circle Area: " + circle.getArea(1));
    }
}
