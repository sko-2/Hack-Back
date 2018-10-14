package unk.HackBack.Models;

import unk.HackBack.Entities.Comment;

import java.util.List;

public class ForumPostModel {

    private ForumCardModel forum;

    private List<Comment> comments;

    public ForumPostModel(ForumCardModel forum, List<Comment> comments) {
        this.forum = forum;
        this.comments = comments;
    }
}
