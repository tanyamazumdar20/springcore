package ua.epam.spring.hometask.dao;

import ua.epam.spring.hometask.model.Auditorium;
import ua.epam.spring.hometask.model.Event;

import java.util.HashMap;
import java.util.Map;

import static ua.epam.spring.hometask.model.EventRating.HIGH;
import static ua.epam.spring.hometask.model.EventRating.LOW;
import static ua.epam.spring.hometask.model.EventRating.MID;

public class AuditoriumDAO {
    private Map<String, Auditorium> constructAuditoriumMap(){
        Auditorium auditorium = new Auditorium();
        auditorium.setName("Twilight");
        auditorium.setNumberOfSeats(LOW);
        auditorium.setVipSeats(11L);

        Map<String, Event> eventMap = new HashMap(){{
            put("11L",event1);
            put("15L",event2);
            put("33L", event3);
        }};
        return eventMap;
    }
}
