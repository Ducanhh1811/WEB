package model.study;

public class subjects {
    private int subjectID, userID;
    private String subjectName, description;

    public subjects() {
    }

    public subjects(int subjectID, int userID, String subjectName, String description) {
        this.subjectID = subjectID;
        this.userID = userID;
        this.subjectName = subjectName;
        this.description = description;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return subjectID + ", " + userID + ", " + subjectName
                + ", " + description;
    }

}
