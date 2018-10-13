package unk.HackBack.Models;

import java.sql.Date;

public class ForumCardModel {

    private String title;
    private Date dateTime;
    private String longText;
    private String username;

    public ForumCardModel(String title, Date dateTime, String longText, String username) {
        this.title = title;
        this.dateTime = dateTime;
        this.longText = longText;
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getLongText() {
        return longText;
    }

    public void setLongText(String longText) {
        this.longText = longText;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
