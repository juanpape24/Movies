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
import com.example.juanjose.movies.IO.ApiAdapter;
import com.example.juanjose.movies.Modelo.Movie;
import com.example.juanjose.movies.R;
import com.example.juanjose.movies.Response.ResponseMovies;

import java.util.ArrayList;

public class VistaActivity extends AppCompatActivity {
    RecyclerView infoMovies;
    AdapterMovies adapterMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movieactivity);
        infoMovies=findViewById(R.id.infoMovies);

        LinearLayoutManager l = new LinearLayoutManager(this);
        infoMovies.setLayoutManager(l);
        adapterMovies=new AdapterMovies(this);
        infoMovies.setAdapter(adapterMovies);

        Call<ResponseMovies> call= ApiAdapter.getApiService().getMovies();
        call.enqueue(new Callback<ResponseMovies>() {
            @Override
            public void onResponse(Call<ResponseMovies> call, Response<ResponseMovies> response) {
                if(response.isSuccessful()){

                    ResponseMovies rta= response.body();
                    ArrayList<Movie> moviesArray= new ArrayList<>();
                    Movie[] movies= rta.getResults();
                    Log.i("MoviesSize","SIZE"+movies.length);
                    String contenido="";
                    for (int i=0;i<movies.length;i++){
                        //moviesArray.add(movies[i]);
                        adapterMovies.addM(movies[i]);
                        //contenido +=movies[i].toString()+"\n"+"\n";
                    }

                    //muestra.setText(contenido);


                }
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
