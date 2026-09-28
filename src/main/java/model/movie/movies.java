package model.movie;

import java.sql.Date;

public class movies {
    private int movieID;
    private String movieName, description, image, director;
    private Date releaseDate;
    private Integer categoryID;
    private boolean status;

    public movies() {
    }

    public movies(int movieID, String movieName, String description, String image, String director, Date releaseDate,
            Integer categoryID, boolean status) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.description = description;
        this.image = image;
        this.director = director;
        this.releaseDate = releaseDate;
        this.categoryID = categoryID;
        this.status = status;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
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
        return movieID + ", " + movieName + ", " + description + ", "
                + image + ", " + director + ", " + releaseDate + ", " + categoryID
                + ", " + status;
    }

}
