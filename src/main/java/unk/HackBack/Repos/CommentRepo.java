package unk.HackBack.Repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import unk.HackBack.Entities.Comment;

import java.util.List;

public interface CommentRepo extends CrudRepository<Comment, Integer> {

    @Query(value = "SELECT * FROM Comment WHERE ForumID = ?1", nativeQuery = true)
    List<Comment> findAllCommentsByForumId(Integer forumId);
}
