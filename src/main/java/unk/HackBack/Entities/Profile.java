package unk.HackBack.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    @Column(name = "ProfileID")
    @Size(max = 33)
    private String profileID;

    @Column(name = "UserName")
    @Size(max = 50)
    private String userName;

    @Column(name = "FName")
    @Size(max = 45)
    private String firstName;

    @Column(name = "LName")
    @Size(max = 45)
    private String lastName;

    @Column(name = "Email")
    @Email
    @Size(max = 45)
    private String email;

    @Column(name = "Bio")
    @Size(max = 500)
    private String bio;

    @Column(name = "DOB")
    private Date dateOfBirth;

    @Column(name = "Gender")
    @Size(max = 15)
    private String gender;

    @Column(name = "Language")
    @Size(max = 3)
    private String language;

    @Column(name = "COO")
    @Size(max = 50)
    private String coo;

    @Column(name = "City")
    @Size(max = 45)
    private String city;

    @Column(name = "State")
    @Size(max = 2)
    private String state;

    public String getProfileID() {
        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String getCoo() {
        return coo;
    }

    public void setCoo(String coo) {
        this.coo = coo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
