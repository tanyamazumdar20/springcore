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

}
