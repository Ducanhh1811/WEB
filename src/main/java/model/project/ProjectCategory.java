package model.project;

public class ProjectCategory {
    private int categoryID;
    private String categoryName;

    public ProjectCategory() {
    }

    public ProjectCategory(int categoryID, String categoryName) {
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
        return "ProjectCategory{" + "categoryID=" + categoryID + ", categoryName='" + categoryName + '\'' + '}';
    }
}