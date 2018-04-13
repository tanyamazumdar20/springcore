package ua.epam.spring.hometask.service;

import org.springframework.beans.factory.annotation.Autowired;
import ua.epam.spring.hometask.dao.UserDAO;
import ua.epam.spring.hometask.model.User;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

  UserDAO userDAO = new UserDAO();

  @Nullable
  @Override
  public User getUserByEmail(@Nonnull String email) {
  //userDAO.
    return null;
  }

  @Override
  public User save(@Nonnull User object) {
    return null;
  }

  @Override
  public void remove(@Nonnull User object) {

  }

  @Override
  public User getById(@Nonnull Long id) {
    return null;
  }

  @Nonnull
  @Override
  public Collection<User> getAll() {
    return null;
  }

  public static void main(String[] args) {
    UserServiceImpl x = new UserServiceImpl();
    x.getUserByEmail("tanya@email.com");
  }
}
