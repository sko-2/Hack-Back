package unk.HackBack.Models;

import java.sql.Date;

public class EventModel {

    private String userId;
    private String street;
    private String City;
    private String state;
    private Integer zip;
    private String title;
    private String longDesc;
    private Date date;

    public EventModel(String userId, String street, String city, String state, Integer zip, String title, String longDesc, Date date) {
        this.userId = userId;
        this.street = street;
        City = city;
        this.state = state;
        this.zip = zip;
        this.title = title;
        this.longDesc = longDesc;
        this.date = date;
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

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
