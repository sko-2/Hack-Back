package unk.HackBack.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "Event")
public class Event {

    @Id
    @Column(name = "EventID")
    private Integer eventId;

    @Column(name = "ForumID")
    private Integer forumId;

    @Column(name = "UserID")
    @Size(max = 36)
    private String userId;

    @Column(name = "Street")
    @Size(max = 75)
    private String street;

    @Column(name = "City")
    @Size(max = 50)
    private String city;

    @Column(name = "State")
    @Size(max = 2)
    private String state;

    @Column(name = "ZIP")
    private Integer zip;

    @Column(name = "Title")
    @Size(max = 100)
    private String title;

    @Column(name = "LongDesc")
    @Size(max = 5000)
    private String longDesc;

    @Column(name = "EventDate")
    private Date dateTime;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
