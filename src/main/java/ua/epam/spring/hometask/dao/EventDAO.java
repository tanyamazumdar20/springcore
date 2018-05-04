package ua.epam.spring.hometask.dao;

import ua.epam.spring.hometask.model.Event;

import java.util.HashMap;

import static ua.epam.spring.hometask.model.EventRating.HIGH;
import static ua.epam.spring.hometask.model.EventRating.LOW;
import static ua.epam.spring.hometask.model.EventRating.MID;

public class EventDAO {

  public HashMap<Long, Event> setEventMap() {
    HashMap<Long, Event> eventMap = new HashMap();
    eventMap.put(1l, new Event("Life", 10, HIGH, 1l));
    eventMap.put(2l, new Event("Love", 5, MID, 2l));
    eventMap.put(3l, new Event("Fear", 15, LOW, 3l));
    return eventMap;
  }
//  private Map<String, Event> constructEventMap(){
//    Event event1 = new Event();
//    event1.setBasePrice(11);
//    event1.setName("Love Story");
//    event1.setRating(LOW);
//    event1.setId(11L);
//
//    Event event2 = new Event();
//    event2.setBasePrice(15);
//    event1.setName("Super woman");
//    event2.setRating(MID);
//    event2.setId(15L);
//
//    Event event3 = new Event();
//    event3.setBasePrice(33);
//    event3.setName("Blessed child");
//    event3.setRating(HIGH);
//    event3.setId(33L);
//
//
//    Map<String, Event> eventMap = new HashMap(){{
//      put("11L",event1);
//      put("15L",event2);
//      put("33L", event3);
//    }};
//    return eventMap;
//  }

}
