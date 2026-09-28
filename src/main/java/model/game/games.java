package model.game;

import java.sql.Date;

public class games {
    private int gameID;
    private String gameName, description, image, developer;
    private Date releaseDate;
    private Integer genreID;
    private boolean status;

    public games() {
    }

    public games(int gameID, String gameName, String description, String image, String developer, Date releaseDate,
            Integer genreID, boolean status) {
        this.gameID = gameID;
        this.gameName = gameName;
        this.description = description;
        this.image = image;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.genreID = genreID;
        this.status = status;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
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

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getGenreID() {
        return genreID;
    }

    public void setGenreID(Integer genreID) {
        this.genreID = genreID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return gameID + ", " + gameName + ", " + description + ", "
                + image + ", " + developer + ", " + releaseDate + ", " + genreID
                + ", " + status;
    }

}
