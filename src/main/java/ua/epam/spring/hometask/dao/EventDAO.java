package ua.epam.spring.hometask.dao;

import ua.epam.spring.hometask.model.Event;
import ua.epam.spring.hometask.model.User;

import java.util.HashMap;
import java.util.Map;

import static ua.epam.spring.hometask.model.EventRating.HIGH;
import static ua.epam.spring.hometask.model.EventRating.LOW;
import static ua.epam.spring.hometask.model.EventRating.MID;

public class EventDAO {
  private Map<String, Event> constructEventMap(){
    Event event1 = new Event();
    event1.setBasePrice(11);
    event1.setName("Love Story");
    event1.setRating(LOW);
    event1.setId(11L);

    Event event2 = new Event();
    event2.setBasePrice(15);
    event1.setName("Super woman");
    event2.setRating(MID);
    event2.setId(15L);

    Event event3 = new Event();
    event3.setBasePrice(33);
    event3.setName("Blessed child");
    event3.setRating(HIGH);
    event3.setId(33L);


    Map<String, Event> eventMap = new HashMap(){{
      put("11L",event1);
      put("15L",event2);
      put("33L", event3);
    }};
    return eventMap;
  }

  /**
   * This method constructs user map.
   * @return
   */
  private Map<String, User> constructUserMap(){
    User user1 = new User();
    user1.setFirstName("tanya");
    user1.setLastName("mazumdar");
    user1.setEmail("tanya@gmail.com");
    user1.setId(10L);
    //user1.setTickets();

    User user2 = new User();
    user2.setFirstName("soni");
    user2.setLastName("jamin");
    user2.setEmail("somi@gmail.com");
    user2.setId(20L);
    //user2.setTickets();

    User user3 = new User();
    user3.setFirstName("ragini");
    user3.setLastName("hamsari");
    user3.setEmail("ragini@gmail.com");
    user3.setId(30L);
    //user3.setTickets();

    User user4 = new User();
    user4.setFirstName("yukti");
    user4.setLastName("inahi");
    user4.setEmail("yukti@gmail.com");
    user4.setId(40L);
    //user4.setTickets();

    User user5 = new User();
    user5.setFirstName("kumila");
    user5.setLastName("mohini");
    user5.setEmail("kumila@gmail.com");
    user5.setId(50L);
    //user5.setTickets();

    User user6 = new User();
    user6.setFirstName("imhar");
    user6.setLastName("tazeev");
    user6.setEmail("imhar@gmail.com");
    user6.setId(60L);
    //user6.setTickets();


    Map<String,User> userMap = new HashMap(){{
      put("10L",user1);
      put("20L",user2);
      put("30L",user3);
      put("40L",user4);
      put("50L",user5);
      put("60L",user6);
    }};
    return userMap;
  }
}
