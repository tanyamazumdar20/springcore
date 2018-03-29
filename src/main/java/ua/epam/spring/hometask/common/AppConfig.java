package ua.epam.spring.hometask.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public String greeting() {
    return "world";
  }

  public static void main(String [] args){
    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
    String text = (String) appContext.getBean("greeting");
    System.out.println("Hello " + text);
  }
}
