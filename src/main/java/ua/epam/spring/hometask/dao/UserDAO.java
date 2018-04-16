package ua.epam.spring.hometask.dao;

import ua.epam.spring.hometask.model.User;

import java.util.HashMap;

public class UserDAO {

    public HashMap<Long, User> setUserMap() {
    HashMap<Long, User> userMap = new HashMap();
    userMap.put(1l, new User("tanya@email.com", "Tanya", "Mazum", 1l));
    userMap.put(2l, new User("nameen@email.com", "Nameen", "Seher", 2l));
    userMap.put(3l, new User("aeena@email.com", "Aeena", "Rabin", 3l));
    return userMap;
  }
}


