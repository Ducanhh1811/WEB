package model.project;

import java.sql.Date;

public class projects {
    private int projectID, userID, categoryID;
    private String projectName, description, image, githubLink, demoLink;
    private Date startDate, endDate;
    private String status;

    public projects() {
    }

    public projects(int projectID, int userID, int categoryID, String projectName, String description, String image,
            String githubLink, String demoLink, Date startDate, Date endDate, String status) {
        this.projectID = projectID;
        this.userID = userID;
        this.categoryID = categoryID;
        this.projectName = projectName;
        this.description = description;
        this.image = image;
        this.githubLink = githubLink;
        this.demoLink = demoLink;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public String getDemoLink() {
        return demoLink;
    }

    public void setDemoLink(String demoLink) {
        this.demoLink = demoLink;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return projectID + ", " + userID + ", " + categoryID
                + ", " + projectName + ", " + description + ", " + image + ", "
                + githubLink + ", " + demoLink + ", " + startDate + ", " + endDate
                + ", " + status;
    }

}
