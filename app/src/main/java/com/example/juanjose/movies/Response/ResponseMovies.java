package com.example.juanjose.movies.Response;

import com.example.juanjose.movies.Modelo.Movie;
import com.google.gson.Gson;

import java.util.ArrayList;

public class ResponseMovies {
    private int page;
    private int total_results;
    private int total_pages;
    private Movie[] results;

    /*public ArrayList<Movie> jsonMovies(){
        Gson gson = new Gson();
        ArrayList<Movie> movies= new ArrayList<>();
        for (int i = 0; i< getResults().length; i++){
            Movie pelicula = gson.fromJson(getResults()[i], Movie.class);
            movies.add(pelicula);
        }
        return movies;
    }*/

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public Movie[] getResults() {
        return results;
    }

    public void setResults(Movie[] results) {
        this.results = results;
    }
}
