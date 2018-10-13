package unk.HackBack.Entities;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "Forum")
public class Forum {

    @Id
    @Column(name = "ForumID")
    private int forumID;

    @Column(name = "LongDescr")
    private String forumDescr;

    @Column(name = "PostTime")
    private Date forumPostTime;

    @Column(name = "Title")
    private String forumTitle;

    @Column(name = "UserID")
    private String forumUserID;

    public int getForumID() {
        return forumID;
    }

    public void setForumID(int forumID) {
        this.forumID = forumID;
    }

    public String getForumDescr() {
        return forumDescr;
    }

    public void setForumDescr(String forumDescr) {
        this.forumDescr = forumDescr;
    }

    public Date getForumPostTime() {
        return forumPostTime;
    }

    public void setForumPostTime(Date forumPostTime) {
        this.forumPostTime = forumPostTime;
    }

    public String getForumTitle() {
        return forumTitle;
    }

    public void setForumTitle(String forumTitle) {
        this.forumTitle = forumTitle;
    }

    public String getForumUserID() {
        return forumUserID;
    }

    public void setForumUserID(String forumUserID) {
        this.forumUserID = forumUserID;
    }
}
