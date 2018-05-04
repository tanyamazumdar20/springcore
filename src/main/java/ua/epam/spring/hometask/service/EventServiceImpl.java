package ua.epam.spring.hometask.service;

import ua.epam.spring.hometask.dao.EventDAO;
import ua.epam.spring.hometask.model.Event;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;

import static ua.epam.spring.hometask.model.EventRating.HIGH;
import static ua.epam.spring.hometask.model.EventRating.LOW;
import static ua.epam.spring.hometask.model.EventRating.MID;

/** EventService - Manages events (movie shows).
 * Event contains only basic information, like name, base price for tickets, rating (high, mid, low).
 * Event can be presented on several dates and several times within each day.
 * For each dateTime an Event will be presented only in single Auditorium.
 todo : save, remove, getById, getByName, getAll
 todo : getForDateRange(from, to) - returns events for specified date range (OPTIONAL)
 todo : getNextEvents(to) - returns events from now till the ‘to’ date (OPTIONAL)
 */
public class EventServiceImpl implements EventService{

  EventDAO eventDAO = new EventDAO();
  HashMap<Long, Event> getEventMap = eventDAO.setEventMap();

  @Nullable
  @Override
  public Event getByName(@Nonnull String name) {
    getEventMap
        .entrySet()
        .stream()
        .filter(e -> e.getValue().getName().equals("Life"))
        .forEach(e ->
            System.out.println(e.getKey()+" : "+e.getValue()));
    return null;
  }

  @Override
  public Event save(@Nonnull Event object) {
    getEventMap.put(object.getId(), object);
    return null;
  }

  @Override
  public void remove(@Nonnull Event object) {
    getEventMap.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  @Override
  public Event getById(@Nonnull Long id) {
    getEventMap
        .entrySet()
        .stream()
        .filter(e -> e.getValue().getId().equals(id))
        .forEach(e ->
            System.out.println(e.getKey()+" : "+e.getValue()));
    return null;
  }

  @Nonnull
  @Override
  public Collection<Event> getAll() {
    return null;
  }

    public static void main(String[] args) {
   EventServiceImpl e = new EventServiceImpl();
    System.out.println("saved Event");
    e.save(new Event("Life", 10, HIGH, 1l));
    e.save(new Event("Love", 5, MID, 2l));
    e.save(new Event("Fear", 15, LOW, 3l));
    System.out.println("_____________all event from map__________________________________");
    e.getEventMap.entrySet().forEach(entry -> {
      System.out.println(entry.getKey()+":"+entry.getValue());
    });
    System.out.println("event by email");
    e.getByName("Life");
    System.out.println("event by id");
    e.getById(7l);
    System.out.println("event removed");
    e.remove(e.getEventMap.get(5l));
    System.out.println("_____________all event from map after removal_____________________");
    e.getEventMap.entrySet().forEach(entry -> {
      System.out.println(entry.getKey()+":"+entry.getValue());
    });
  }
}
