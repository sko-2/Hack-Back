package unk.HackBack.Services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import unk.HackBack.Entities.Comment;
import unk.HackBack.Entities.Event;
import unk.HackBack.Entities.Forum;
import unk.HackBack.Models.EventModel;
import unk.HackBack.Models.ForumCardModel;
import unk.HackBack.Models.ForumPostModel;
import unk.HackBack.Repos.CommentRepo;
import unk.HackBack.Repos.EventRepo;
import unk.HackBack.Repos.ForumRepository;
import unk.HackBack.Repos.ProfileRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ForumService {

    private ForumRepository forumRepository;
    private ProfileRepository profileRepository;
    private CommentRepo commentRepo;
    private EventRepo eventRepo;

    public ForumService(ForumRepository forumRepository, ProfileRepository profileRepository, CommentRepo commentRepo, EventRepo eventRepo) {
        this.forumRepository = forumRepository;
        this.profileRepository = profileRepository;
        this.commentRepo = commentRepo;
        this.eventRepo = eventRepo;
    }

    public Page<ForumCardModel> getForumCards(Pageable pageable) {

        Page<Forum> forums = forumRepository.findAll(pageable);

        List<ForumCardModel> cards = new ArrayList<>();

        forums.forEach(x -> {
           String userName = profileRepository.findUserNameByUserId(x.getForumUserID());
           ForumCardModel card = new ForumCardModel(x.getForumTitle(), x.getForumPostTime(), x.getForumDescr(), userName);
           cards.add(card);
        });

        Page<ForumCardModel> result = new PageImpl(cards);

        return result;
    }

    public ForumPostModel getForumPost(Integer id) {
        Forum forum = forumRepository.findById(id).get();
        String userName = profileRepository.findUserNameByUserId(forum.getForumUserID());
        ForumCardModel forumData = new ForumCardModel(forum.getForumTitle(), forum.getForumPostTime(), forum.getForumDescr(), userName);

        List<Comment> comments = commentRepo.findAllCommentsByForumId(id);

        Event event = eventRepo.findEventByForumId(forum.getForumID());

        if (event != null) {
            EventModel eventModel = new EventModel(event.getUserId(), event.getStreet(), event.getCity(), event.getState(), event.getZip(), event.getTitle(), event.getLongDesc(), event.getDateTime());
            return new ForumPostModel(forumData, comments, eventModel);
        }


        return new ForumPostModel(forumData, comments);
    }
}
