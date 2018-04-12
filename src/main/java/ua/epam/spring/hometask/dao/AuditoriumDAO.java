package ua.epam.spring.hometask.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import ua.epam.spring.hometask.model.Auditorium;

import java.util.HashMap;
import java.util.Map;

public class AuditoriumDAO {

  @Value("${auditorium1.name}")
  String auditoriumName1;
  @Value("${auditorium1.numberOfSeats}")
  String numberOfSeats1;
  //@Value ("${auditorium1.vipSeats}")
  //TODO: List<Integer> vipSeats;

  @Value("${auditorium2.name}")
  String auditoriumName2;
  @Value("${auditorium2.numberOfSeats}")
  String numberOfSeats2;
  //@Value ("${auditorium2.vipSeats}")
  //TODO: List<Integer> vipSeats;

  @Value("${auditorium3.name}")
  String auditoriumName3;
  @Value("${auditorium3.numberOfSeats}")
  String numberOfSeats3;
  //@Value ("${auditorium3.vipSeats}")
  //TODO: List<Integer> vipSeats;

  @Bean
  @Scope("prototype")
  private Map<String, Auditorium> constructAuditoriumMap() {
    Auditorium auditorium1 = new Auditorium();
    auditorium1.setName(auditoriumName1);
    auditorium1.setNumberOfSeats(Integer.getInteger(numberOfSeats1));
    // todo auditorium1.setVipSeats();

    Auditorium auditorium2 = new Auditorium();
    auditorium2.setName(auditoriumName2);
    auditorium2.setNumberOfSeats(Integer.getInteger(numberOfSeats2));
    // TODO auditorium2.setVipSeats();

    Auditorium auditorium3 = new Auditorium();
    auditorium3.setName(auditoriumName3);
    auditorium3.setNumberOfSeats(Integer.getInteger(numberOfSeats3));
    // TODO auditorium3.setVipSeats();

    Map<String, Auditorium> auditoriumMap = new HashMap() {{
      put("1", auditorium1);
      put("2", auditorium2);
      put("3", auditorium3);
    }};
    return auditoriumMap;
  }
}
