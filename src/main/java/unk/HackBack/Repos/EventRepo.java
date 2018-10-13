package unk.HackBack.Repos;

import org.springframework.data.repository.CrudRepository;
import unk.HackBack.Entities.Event;

public interface EventRepo extends CrudRepository<Event, Integer> {
}
