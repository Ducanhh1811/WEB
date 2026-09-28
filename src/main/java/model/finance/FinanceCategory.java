package model.finance;

public class FinanceCategory {
    private int categoryID;
    private String categoryName;
    private String type;

    public FinanceCategory() {
    }

    public FinanceCategory(int categoryID, String categoryName, String type) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FinanceCategory{" + "categoryID=" + categoryID + ", categoryName='" + categoryName + '\''
                + ", type='" + type + '\'' + '}';
    }
}