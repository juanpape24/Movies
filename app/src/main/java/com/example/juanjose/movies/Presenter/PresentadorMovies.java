package com.example.juanjose.movies.Presenter;

import android.util.Log;

import com.example.juanjose.movies.AdapterMovies;
import com.example.juanjose.movies.Contract.ContractMovies;
import com.example.juanjose.movies.IO.ApiAdapter;
import com.example.juanjose.movies.Modelo.Movie;
import com.example.juanjose.movies.Response.ResponseMovies;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PresentadorMovies implements ContractMovies.PresenterM {
    public PresentadorMovies() {
    }

    @Override
    public void peticion(final AdapterMovies adapterMovies) {
        Call<ResponseMovies> call= ApiAdapter.getApiService().getMovies();
        call.enqueue(new Callback<ResponseMovies>() {
            @Override
            public void onResponse(Call<ResponseMovies> call, Response<ResponseMovies> response) {
                if(response.isSuccessful()){

                    ResponseMovies rta= response.body();
                    ArrayList<Movie> moviesArray= new ArrayList<>();
                    Movie[] movies= rta.getResults();
                    for (int i=0;i<movies.length;i++){
                        adapterMovies.addM(movies[i]);
                    }                }
                else{
                    Log.i("MoviesSize","ERROR");}
            }

            @Override
            public void onFailure(Call<ResponseMovies> call, Throwable t) {
                Log.i("Error2","Error-->",t);
            }
        });
    }
}
