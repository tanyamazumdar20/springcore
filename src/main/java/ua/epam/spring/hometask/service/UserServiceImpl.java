package ua.epam.spring.hometask.service;

import org.springframework.context.annotation.Configuration;
import ua.epam.spring.hometask.dao.UserDAO;
import ua.epam.spring.hometask.model.User;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;

@Configuration
public class UserServiceImpl implements UserService {

  UserDAO userDAO = new UserDAO();
  HashMap<Long, User> getUserMap = userDAO.setUserMap();

  @Nullable
  @Override
  public User getUserByEmail(@Nonnull String email) {
    getUserMap
        .entrySet()
        .stream()
        .filter(e -> e.getValue().getEmail().equals(email))
        .forEach(e ->
            System.out.println(e.getKey()+" : "+e.getValue()));
    return null;
  }

  @Override
  public User save(@Nonnull User object) {
    getUserMap.put(object.getId(), object);
    return null;
  }

  @Override
  public void remove(@Nonnull User object) {
    getUserMap.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  @Override
  public User getById(@Nonnull Long id) {
        getUserMap
        .entrySet()
        .stream()
        .filter(e -> e.getValue().getId().equals(id))
        .forEach(e ->
            System.out.println(e.getKey()+" : "+e.getValue()));
    return null;
  }

  @Nonnull
  @Override
  public Collection<User> getAll() {
    getUserMap.entrySet().forEach(entry -> {
      System.out.println(entry.getKey()+":"+entry.getValue());
    });
    return null;
  }

  /*public static void main(String[] args) {
    UserServiceImpl x = new UserServiceImpl();
    System.out.println("saved user");
    x.save(new User("mahi@email.com", "Mahi", "Yasan", 4l));
    x.save(new User("tilak@email.com", "Tilak", "Nand", 5l));
    x.save(new User("meena@email.com", "Meena", "Soni", 6l));
    x.save(new User("kohinoor@email.com", "Noor", "Sinha", 7l));
    System.out.println("_____________all users from map__________________________________");
//    x.getUserMap.entrySet().forEach(entry -> {
//      System.out.println(entry.getKey()+":"+entry.getValue());
//    });
    System.out.println("user by email");
    x.getUserByEmail("meena@email.com");
    System.out.println("user by id");
    x.getById(7l);
    System.out.println("user removed");
    x.remove(x.getUserMap.get(5l));
    System.out.println("_____________all users from map after removal_____________________");
//    x.getUserMap.entrySet().forEach(entry -> {
//      System.out.println(entry.getKey()+":"+entry.getValue());
//    });
  }*/
}
