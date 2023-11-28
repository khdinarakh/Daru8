package com.company.task5;

import java.util.Objects;

public class Movie implements Cloneable{
    /*
    title, которая является строкой, представляющей название фильма
studio, которая является строкой, представляющей студию, снявшую фильм
rating, которая представляет собой строку, обозначающую рейтинг фильма (например, PG13, R и т.д.).
*/

    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return getTitle().equals(movie.getTitle()) && getStudio().equals(movie.getStudio()) && getRating().equals(movie.getRating());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getStudio(), getRating());
    }

    @Override
    public Movie clone() throws CloneNotSupportedException{
        return (Movie) super.clone();
    }

}
