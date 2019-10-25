package com.example.juanjose.movies.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;

import com.example.juanjose.movies.AdapterMovies;
import com.example.juanjose.movies.Contract.ContractMovies;
import com.example.juanjose.movies.IO.ApiAdapter;
import com.example.juanjose.movies.Modelo.Movie;
import com.example.juanjose.movies.Presenter.PresentadorMovies;
import com.example.juanjose.movies.R;
import com.example.juanjose.movies.Response.ResponseMovies;

import java.util.ArrayList;

public class VistaActivity extends AppCompatActivity{
    RecyclerView infoMovies;
    AdapterMovies adapterMovies;
    PresentadorMovies presentadorMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movieactivity);
        infoMovies=findViewById(R.id.infoMovies);
        presentadorMovies= new PresentadorMovies();
        LinearLayoutManager l = new LinearLayoutManager(this);
        infoMovies.setLayoutManager(l);
        adapterMovies=new AdapterMovies(this);
        infoMovies.setAdapter(adapterMovies);
        presentadorMovies.peticion(adapterMovies);






    }


}
