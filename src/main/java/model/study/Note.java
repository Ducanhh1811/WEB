package model.study;

import java.sql.Timestamp;

public class Note {
    private int noteID;
    private int userID;
    private Integer subjectID;
    private String title;
    private String content;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    public Note() {
    }

    public Note(int noteID, int userID, Integer subjectID, String title, String content, Timestamp createdDate,
            Timestamp updatedDate) {
        this.noteID = noteID;
        this.userID = userID;
        this.subjectID = subjectID;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getNoteID() {
        return noteID;
    }

    public void setNoteID(int noteID) {
        this.noteID = noteID;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Note{" + "noteID=" + noteID + ", userID=" + userID + ", subjectID=" + subjectID
                + ", title='" + title + '\'' + ", content='" + content + '\'' + ", createdDate=" + createdDate
                + ", updatedDate=" + updatedDate + '}';
    }
}