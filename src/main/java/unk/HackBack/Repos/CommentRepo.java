package unk.HackBack.Repos;

import org.springframework.data.repository.CrudRepository;
import unk.HackBack.Entities.Comment;

public interface CommentRepo extends CrudRepository<Comment, Integer> {
}
