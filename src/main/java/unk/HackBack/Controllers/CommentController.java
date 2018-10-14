package unk.HackBack.Controllers;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unk.HackBack.Entities.Comment;
import unk.HackBack.Models.CommentModel;
import unk.HackBack.Repos.CommentRepo;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("api/comments/")
public class CommentController {

    private CommentRepo repo;

    public CommentController(CommentRepo repo){
        this.repo = repo;
    }

    @PostMapping
    @RequestMapping ("save")
    public HttpStatus commentSave(@RequestBody CommentModel model){

        Comment entity = new Comment();
        entity.setBody(model.getText());
        entity.setCommentId(model.getCommentID());
        entity.setDateTime(model.getTime());
        entity.setForumId(model.getForumID());
        entity.setUserId(model.getUserID());
        entity.setDateTime(LocalDateTime.now());

        try{
            this.repo.save(entity);
            return HttpStatus.OK;
        }
        catch (Exception e){
            return HttpStatus.BAD_REQUEST;
        }

    }


}
