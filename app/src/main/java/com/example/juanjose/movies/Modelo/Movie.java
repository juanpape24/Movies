package com.example.juanjose.movies.Modelo;

import java.util.Arrays;

public class Movie {
    double popularity;
    int vote_count;
    boolean video;
    String poster_path;
    int id;
    boolean adult;
    String backdrop_path;
    String original_language;
    String original_title;
    int[] genre_ids;
    String title;
    double vote_average;
    String overview;
    String release_date;

    @Override
    public String toString() {
        return "Movie{" +
                "popularity=" + popularity +
                ", vote_count=" + vote_count +
                ", video=" + video +
                ", poster_path='" + poster_path + '\'' +
                ", id=" + id +
                ", adult=" + adult +
                ", backdrop_path='" + backdrop_path + '\'' +
                ", original_language='" + original_language + '\'' +
                ", original_title='" + original_title + '\'' +
                ", genre_ids=" + Arrays.toString(genre_ids) +
                ", title='" + title + '\'' +
                ", vote_average=" + vote_average +
                ", overview='" + overview + '\'' +
                ", release_date='" + release_date + '\'' +
                '}';
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int[] getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(int[] genre_ids) {
        this.genre_ids = genre_ids;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}
