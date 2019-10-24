package com.example.juanjose.movies.IO;

import com.example.juanjose.movies.Modelo.Movie;
import com.example.juanjose.movies.Response.ResponseMovies;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("popular?api_key=09963e300150f9831c46a1828a82a984&language=en-US")
    Call<ResponseMovies> getMovies();


}
