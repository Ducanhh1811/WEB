package model.schedule;

import java.sql.Timestamp;

public class schedules {
    private int scheduleID, userID;
    private String title, description;
    private Timestamp startTime, endTime;
    private String location;

    public schedules() {
    }

    public schedules(int scheduleID, int userID, String title, String description, Timestamp startTime,
            Timestamp endTime,
            String location) {
        this.scheduleID = scheduleID;
        this.userID = userID;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return scheduleID + ", " + userID + ", " + title + ", "
                + description + ", " + startTime + ", " + endTime + ", " + location;
    }

}
