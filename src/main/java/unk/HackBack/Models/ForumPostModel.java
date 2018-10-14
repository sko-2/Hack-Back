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

    public ForumCardModel getForum() {
        return forum;
    }

    public void setForum(ForumCardModel forum) {
        this.forum = forum;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
