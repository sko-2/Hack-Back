package unk.HackBack.Services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import unk.HackBack.Entities.Forum;
import unk.HackBack.Models.ForumCardModel;
import unk.HackBack.Repos.ForumRepository;
import unk.HackBack.Repos.ProfileRepository;

@Service
public class ForumService {

    private ForumRepository forumRepository;
    private ProfileRepository profileRepository;

    public ForumService(ForumRepository forumRepository, ProfileRepository profileRepository) {
        this.forumRepository = forumRepository;
        this.profileRepository = profileRepository;
    }

    public Page<ForumCardModel> getForumCards(Pageable pageable) {

        Page<Forum> forums = forumRepository.findAll(pageable);

        Page<ForumCardModel> cards = null;

        forums.forEach(x -> {
           String userName = profileRepository.findUserNameByUserId(x.getForumUserID());
           ForumCardModel card = new ForumCardModel(x.getForumTitle(), x.getForumPostTime(), x.getForumDescr(), userName);
        });

        return cards;
    }
}
