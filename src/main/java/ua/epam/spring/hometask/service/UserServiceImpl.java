package ua.epam.spring.hometask.service;

import ua.epam.spring.hometask.domain.User;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

  @Nullable
  @Override
  public User getUserByEmail(@Nonnull String email) {
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
}
