package model.movie;

import java.sql.Timestamp;

public class MovieReview {
    private int reviewID;
    private int userID;
    private int movieID;
    private double rating;
    private String comment;
    private Timestamp reviewDate;

    public MovieReview() {
    }

    public MovieReview(int reviewID, int userID, int movieID, double rating, String comment, Timestamp reviewDate) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.movieID = movieID;
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

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
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
        return "MovieReview{" + "reviewID=" + reviewID + ", userID=" + userID + ", movieID=" + movieID
                + ", rating=" + rating + ", comment='" + comment + '\'' + ", reviewDate=" + reviewDate + '}';
    }
}