package model.food;

import java.sql.Timestamp;

public class FoodReview {
    private int reviewID;
    private int userID;
    private int foodID;
    private double rating;
    private String comment;
    private Timestamp reviewDate;

    public FoodReview() {
    }

    public FoodReview(int reviewID, int userID, int foodID, double rating, String comment, Timestamp reviewDate) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.foodID = foodID;
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

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
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
        return "FoodReview{" + "reviewID=" + reviewID + ", userID=" + userID + ", foodID=" + foodID
                + ", rating=" + rating + ", comment='" + comment + '\'' + ", reviewDate=" + reviewDate + '}';
    }
}