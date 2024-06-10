package org.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.coding();
        obj1.printAge();

        Alien obj2 = (Alien) context.getBean("alien2");

        obj2.coding();
        obj2.printAge();
    }
}
