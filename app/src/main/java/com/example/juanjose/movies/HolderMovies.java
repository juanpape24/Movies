package com.example.juanjose.movies;

import android.app.AlertDialog;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.juanjose.movies.Modelo.Movie;
import com.example.juanjose.movies.Vista.VistaActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderMovies extends RecyclerView.ViewHolder {
    private TextView titulo;
    private TextView descripcion;
    private ImageView img;
    private int id;


    public HolderMovies(@NonNull final View itemView, final ArrayList<Movie> movies) {
        super(itemView);
        titulo= itemView.findViewById(R.id.titulo);
        descripcion= itemView.findViewById(R.id.descripcion);
        img=itemView.findViewById(R.id.img);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog.Builder alerta = new AlertDialog.Builder(itemView.getContext());
                Movie movie= movies.get(id);
                CuadroDialogo cuadroDialogo = new CuadroDialogo(itemView.getContext());
                cuadroDialogo.getTitulo().setText(movie.getTitle());
                cuadroDialogo.getDescripcion().setText(movie.getOverview());
                cuadroDialogo.getVotacion().setText(String.valueOf(movie.getVote_count()));
                cuadroDialogo.getFecha().setText(movie.getRelease_date());
                cuadroDialogo.getPopularidad().setText(String.valueOf(movie.getPopularity()));
                String url = "https://image.tmdb.org/t/p/w600_and_h900_bestv2" + movie.getBackdrop_path();

                Picasso.with(itemView.getContext()).load(url).into(cuadroDialogo.img);
                cuadroDialogo.showDialog();
                //Log.i("index", ""+movies.get(id).getTitle());
            }
        });

    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public TextView getTitulo() {
        return titulo;
    }

    public void setTitulo(TextView titulo) {
        this.titulo = titulo;
    }

    public TextView getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(TextView descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
