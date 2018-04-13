package ua.epam.spring.hometask.dao;

import ua.epam.spring.hometask.model.User;

import java.util.HashMap;

public class UserDAO {

  User user = new User();
  HashMap<Long, User> userMap = new HashMap();

  public void setUserInfo(String email, String firstName, String lastName, Long userId) {
    user.setEmail(email);
    user.setFirstName(firstName);
    user.setLastName(lastName);
    //todo user.setTickets();
    user.setId(userId);
    setUserMap(userId);
  }

  public HashMap<Long, User> setUserMap(Long userId) {
    userMap.put(userId, user);
    return userMap;
  }

  public void searchUser(){
    User user = new User();
    HashMap<Long, User> getUserMap = setUserMap(1l);
    getUserMap
        .entrySet()
        .stream()
        .filter(e -> e.getValue().getFirstName().equals( "tanya"))
        .forEach(e ->
            System.out.println(e.getKey()+" : "+e.getValue()));

    //return null;
  }

  public static void main(String[] args) {
    UserDAO x = new UserDAO();
    x.setUserInfo("tanya@email.com", "tanya", "mazum", 1l);
    x.setUserInfo("nameen@email.com", "nameen", "seher", 2l);
    x.setUserInfo("aeena@email.com", "aeena", "rabin", 3l);
    x.setUserMap(1l);
//    HashMap<Long, User> getMap = x.setUserMap(1l);
//    getMap.entrySet().forEach(entry -> {
//      System.out.println(entry.getKey()+":"+entry.getValue());
//    });

    x.searchUser();
  }


}//close of the class

/**Previous block of code*/
//  private Map<String, User> constructUserMap() {
//    User user1 = new User();
//    user1.setFirstName("tanya");
//    user1.setLastName("mazumdar");
//    user1.setEmail("tanya@gmail.com");
//    user1.setId(10L);
//    //user1.setTickets();
//
//    User user2 = new User();
//    user2.setFirstName("soni");
//    user2.setLastName("jamin");
//    user2.setEmail("somi@gmail.com");
//    user2.setId(20L);
//    //user2.setTickets();
//
//    User user3 = new User();
//    user3.setFirstName("ragini");
//    user3.setLastName("hamsari");
//    user3.setEmail("ragini@gmail.com");
//    user3.setId(30L);
//    //user3.setTickets();
//
//    User user4 = new User();
//    user4.setFirstName("yukti");
//    user4.setLastName("inahi");
//    user4.setEmail("yukti@gmail.com");
//    user4.setId(40L);
//    //user4.setTickets();
//
//    User user5 = new User();
//    user5.setFirstName("kumila");
//    user5.setLastName("mohini");
//    user5.setEmail("kumila@gmail.com");
//    user5.setId(50L);
//    //user5.setTickets();
//
//    User user6 = new User();
//    user6.setFirstName("imhar");
//    user6.setLastName("tazeev");
//    user6.setEmail("imhar@gmail.com");
//    user6.setId(60L);
//    //user6.setTickets();
//
//
//    Map<String,User> userMap = new HashMap(){{
//      put("10L",user1);
//      put("20L",user2);
//      put("30L",user3);
//      put("40L",user4);
//      put("50L",user5);
//      put("60L",user6);
//    }};
//    return userMap;
//  }

//}

