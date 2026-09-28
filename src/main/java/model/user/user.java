package model.user;

import java.sql.Timestamp;

public class user {
    private int userID;
    private String username, password, fullname, email, role;
    private Timestamp createdDate;

    public user() {
    }

    public user(int userID, String username, String password, String fullname, String email, String role,
            Timestamp createdDate) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.role = role;
        this.createdDate = createdDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return userID + ", " + username + ", " + password + ", " + fullname
                + ", " + email + ", " + role + ", " + createdDate;
    }

}
