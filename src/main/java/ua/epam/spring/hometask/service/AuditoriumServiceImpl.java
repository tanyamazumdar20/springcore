package ua.epam.spring.hometask.service;

import org.springframework.beans.factory.annotation.Autowired;
import ua.epam.spring.hometask.dao.EventDAO;
import ua.epam.spring.hometask.model.Auditorium;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Set;

public class AuditoriumServiceImpl implements AuditoriumService {

  @Autowired
  EventDAO eventDAO;

  @Nonnull
  @Override
  public Set<Auditorium> getAll() {
    return null;
    //TODO eventDAO.methods of eventDao;
  }

  @Nullable
  @Override
  public Auditorium getByName(@Nonnull String name) {
    return null;
  }
}
