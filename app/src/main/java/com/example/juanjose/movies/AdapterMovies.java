package com.example.juanjose.movies;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.juanjose.movies.Modelo.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterMovies extends RecyclerView.Adapter<HolderMovies> {
    private ArrayList<Movie> movies = new ArrayList<>();
    private Context c;

    public AdapterMovies(Context c) {
        this.c = c;

    }

    public void addM(Movie movie) {
        movies.add(movie);
        notifyItemInserted(movies.size());
    }


    public void removeM() {
        if (!movies.isEmpty()) {
            notifyItemRangeRemoved(0, movies.size());
            movies.clear();
        }
    }


    @NonNull
    @Override
    public HolderMovies onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_movie, parent, false);


        return new HolderMovies(v,movies);

    }

    @Override
    public void onBindViewHolder(@NonNull HolderMovies holder, int position) {
        holder.setId(position);
        holder.getTitulo().setText(movies.get(position).getTitle());
        holder.getDescripcion().setText(movies.get(position).getOverview());
        String url = "https://image.tmdb.org/t/p/w600_and_h900_bestv2" + movies.get(position).getPoster_path();
        Picasso.with(c).load(url).into(holder.getImg());
        //holder.getImg().setImageBitmap(imagen);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
