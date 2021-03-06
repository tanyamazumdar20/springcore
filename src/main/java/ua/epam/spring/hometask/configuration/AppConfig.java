package ua.epam.spring.hometask.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ua.epam.spring.hometask.dao.EventDAO;
import ua.epam.spring.hometask.model.Auditorium;

@Configuration
public class AppConfig {
    @Value("${auditorium1.name}")
    static String auditoriumName;
    @Value("${auditorium1.numberOfSeats}")
    static String numberOfSeats;
    //@Value ("${auditorium1.vipSeats}")
    //TODO: List<Integer> vipSeats;


    @Bean
    @Scope("prototype")
    public Auditorium auditorium() {
        Auditorium auditorium = new Auditorium();
        auditorium.setName(auditoriumName);
        auditorium.setNumberOfSeats(Integer.getInteger(numberOfSeats));
        return auditorium;
    }

    @Bean
    public EventDAO eventDAO() {
        return new EventDAO();
    }


//    public static void main(String[] args) {
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        System.out.println(auditoriumName + "," +numberOfSeats);
//    }
}
