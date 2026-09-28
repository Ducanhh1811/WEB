package model.food;

import java.math.BigDecimal;

public class foods {
    private int foodID;
    private String foodName, description, image;
    private BigDecimal price;
    private Integer categoryID;
    private boolean status;

    public foods() {
    }

    public foods(int foodID, String foodName, String description, String image, BigDecimal price, Integer categoryID,
            boolean status) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.description = description;
        this.image = image;
        this.price = price;
        this.categoryID = categoryID;
        this.status = status;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return foodID + ", " + foodName + ", " + description + ", "
                + image + ", " + price + ", " + categoryID + ", " + status;
    }

}
