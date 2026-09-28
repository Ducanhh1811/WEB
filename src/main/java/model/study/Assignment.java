package model.study;

import java.sql.Timestamp;

public class Assignment {
    private int assignmentID;
    private int userID;
    private Integer subjectID;
    private String title;
    private String description;
    private Timestamp dueDate;
    private String status;

    public Assignment() {
    }

    public Assignment(int assignmentID, int userID, Integer subjectID, String title, String description,
            Timestamp dueDate, String status) {
        this.assignmentID = assignmentID;
        this.userID = userID;
        this.subjectID = subjectID;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Integer getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(Integer subjectID) {
        this.subjectID = subjectID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDueDate() {
        return dueDate;
    }

    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Assignment{" + "assignmentID=" + assignmentID + ", userID=" + userID + ", subjectID=" + subjectID
                + ", title='" + title + '\'' + ", description='" + description + '\'' + ", dueDate=" + dueDate
                + ", status='" + status + '\'' + '}';
    }
}