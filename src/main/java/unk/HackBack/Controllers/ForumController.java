package unk.HackBack.Controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import unk.HackBack.Services.ForumService;
import unk.HackBack.Models.ForumCardModel;

@RestController
@RequestMapping("api/forums/")
public class ForumController {

    final int DEFAULT_PAGE_SIZE = 30;
    final Sort SORT_BY_DATE_DESC = new Sort(Sort.Direction.DESC, "EventDate");

    private ForumService forumService;

    public ForumController(ForumService forumService) {
        this.forumService = forumService;
    }

    @GetMapping
    @RequestMapping("cards/{page}")
    public Page<ForumCardModel> getForumCards(@RequestParam("page") Integer page) {

        Pageable pageable = PageRequest.of(page, DEFAULT_PAGE_SIZE, SORT_BY_DATE_DESC);
        Page<ForumCardModel> cards = forumService.getForumCards(pageable);
        return cards;
    }

    @GetMapping
    @RequestMapping("cards/{page}/{pageSize}")
    public Page<ForumCardModel> getForumCards(@RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {

        Pageable pageable = PageRequest.of(page, pageSize, SORT_BY_DATE_DESC);
        Page<ForumCardModel> cards = forumService.getForumCards(pageable);
        return cards;
    }
}
