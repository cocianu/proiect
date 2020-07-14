package ro.project.project.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String userIdName;
    private Date userBirth;
    private Long userTel;
    private String userEmail;
    private String userAddress;
    private String userFirstName;
    private String userLastName;
    private String userPerson;


    public String getUserName() {
        return userIdName;
    }
    public void setUserName(String userName) {
        this.userIdName = userName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Date getUserBirth() {
        return userBirth;
    }
    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public Long getUserTel() {
        return userTel;
    }
    public void setUserTel(Long userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserFirstName() {
        return userFirstName;
    }
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserPerson() {
        return userPerson;
    }
    public void setUserPerson(String userPerson) {
        this.userPerson = userPerson;
    }













}


