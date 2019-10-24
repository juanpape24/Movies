package com.example.juanjose.movies;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class CuadroDialogo {
    TextView titulo;
    TextView descripcion;
    TextView votacion;
    TextView fecha;
    TextView popularidad;

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

    public TextView getVotacion() {
        return votacion;
    }

    public void setVotacion(TextView votacion) {
        this.votacion = votacion;
    }

    public TextView getFecha() {
        return fecha;
    }

    public void setFecha(TextView fecha) {
        this.fecha = fecha;
    }

    public TextView getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(TextView popularidad) {
        this.popularidad = popularidad;
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    ImageView img;
    final Dialog dialog;

    public CuadroDialogo(Context context){
        dialog= new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.alert);
        titulo = dialog.findViewById(R.id.titulo2);
        descripcion = dialog.findViewById(R.id.descripcion2);
        votacion = dialog.findViewById(R.id.votacion);
        fecha = dialog.findViewById(R.id.fecha);
        popularidad = dialog.findViewById(R.id.popularidad);
        img= dialog.findViewById(R.id.img2);

    }
    public void showDialog(){
        dialog.show();
    }
}
