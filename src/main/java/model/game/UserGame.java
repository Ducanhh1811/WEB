package model.game;

import java.sql.Date;

public class UserGame {

    private int userID;
    private int gameID;
    private String playStatus;
    private Double rating;
    private Date addedDate;

    public UserGame() {
    }

    public UserGame(int userID, int gameID, String playStatus,
                    Double rating, Date addedDate) {
        this.userID = userID;
        this.gameID = gameID;
        this.playStatus = playStatus;
        this.rating = rating;
        this.addedDate = addedDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(String playStatus) {
        this.playStatus = playStatus;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "UserGame{"
                + "userID=" + userID
                + ", gameID=" + gameID
                + ", playStatus='" + playStatus + '\''
                + ", rating=" + rating
                + ", addedDate=" + addedDate
                + '}';
    }
}