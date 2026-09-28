package model.game;

import java.sql.Timestamp;

public class GameReview {

    private int reviewID;
    private int userID;
    private int gameID;
    private double rating;
    private String comment;
    private Timestamp reviewDate;

    public GameReview() {
    }

    public GameReview(int reviewID, int userID, int gameID,
                      double rating, String comment, Timestamp reviewDate) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.gameID = gameID;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Timestamp reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "GameReview{"
                + "reviewID=" + reviewID
                + ", userID=" + userID
                + ", gameID=" + gameID
                + ", rating=" + rating
                + ", comment='" + comment + '\''
                + ", reviewDate=" + reviewDate
                + '}';
    }
}