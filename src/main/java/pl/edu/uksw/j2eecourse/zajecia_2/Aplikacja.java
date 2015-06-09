package pl.edu.uksw.j2eecourse.zajecia_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplikacja {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Swiat swiat = applicationContext.getBean(Swiat.class);
        swiat.start();
    }

}
