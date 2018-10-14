package unk.HackBack.Models;

import unk.HackBack.Entities.Comment;

import java.util.List;

public class ForumPostModel {

    private ForumCardModel forum;

    private EventModel event;

    private List<Comment> comments;

    public ForumPostModel(ForumCardModel forum, List<Comment> comments) {
        this.forum = forum;
        this.comments = comments;
    }

    public ForumPostModel(ForumCardModel forum, List<Comment> comments, EventModel event) {
        this.forum = forum;
        this.comments = comments;
        this.event = event;
    }

    public ForumCardModel getForum() {
        return forum;
    }

    public void setForum(ForumCardModel forum) {
        this.forum = forum;
    }

    public EventModel getEvent() {
        return event;
    }

    public void setEvent(EventModel event) {
        this.event = event;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
