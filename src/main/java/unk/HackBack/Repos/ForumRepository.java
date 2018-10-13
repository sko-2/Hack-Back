package unk.HackBack.Repos;

import org.springframework.data.repository.CrudRepository;
import unk.HackBack.Entities.Forum;

import javax.persistence.Table;

@Table(name = "Forum")
public interface ForumRepository extends CrudRepository<Forum, Integer> {
}
