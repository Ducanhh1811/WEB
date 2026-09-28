package model.movie;

public class MovieCategory {
    private int categoryID;
    private String categoryName;

    public MovieCategory() {
    }

    public MovieCategory(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "MovieCategory{" + "categoryID=" + categoryID + ", categoryName='" + categoryName + '\'' + '}';
    }
}