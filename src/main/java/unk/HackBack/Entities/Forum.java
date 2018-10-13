package unk.HackBack.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "Forum")
public class Forum {

    @Id
    @Column(name = "ForumID")
    private int forumID;

    @Column(name = "LongDescr")
    @Size(max = 5000)
    private String forumDescr;

    @Column(name = "PostTime")
    private Date forumPostTime;

    @Column(name = "Title")
    @Size(max = 100)
    private String forumTitle;

    @Column(name = "UserID")
    @Size(max = 36)
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
