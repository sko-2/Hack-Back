package unk.HackBack.Repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import unk.HackBack.Entities.Event;

public interface EventRepo extends CrudRepository<Event, Integer> {

    @Query(value = "SELECT * FROM Event WHERE ForumID = ?1", nativeQuery = true)
    Event findEventByForumId(Integer id);
}
