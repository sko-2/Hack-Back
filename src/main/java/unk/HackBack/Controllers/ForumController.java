package unk.HackBack.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unk.HackBack.Entities.Forum;
import unk.HackBack.Repos.ForumRepository;

@RestController
@RequestMapping("api/forums")
public class ForumController {

    private ForumRepository forumRepository;

    public ForumController(ForumRepository forumRepository) {
        this.forumRepository = forumRepository;
    }

    @GetMapping
    public Iterable<Forum> getForums() {
        Iterable<Forum> forums = forumRepository.findAll();

        return forums;
    }
}
