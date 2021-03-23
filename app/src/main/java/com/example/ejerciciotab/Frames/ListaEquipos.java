package com.example.ejerciciotab.Frames;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

public class ListaEquipos  {

    public int imagenEquipo;
    public String nombreEquipo ;

    public ListaEquipos(String nombreEquipo, int imagenEquipo){
        this.imagenEquipo = imagenEquipo;
        this.nombreEquipo = nombreEquipo;
    }


    /*protected ListaEquipos() {
        imagenEquipo = in.readInt();
        nombreEquipo = in.readString();
    }

    public static final Creator<ListaEquipos> CREATOR = new Creator<ListaEquipos>() {
        @Override
        public ListaEquipos createFromParcel(Parcel in) {
            return new ListaEquipos(in);
        }

        @Override
        public ListaEquipos[] newArray(int size) {
            return new ListaEquipos[size];
        }
    };*/


    public int getImagenEquipo() {
        return imagenEquipo;
    }

    public void setImagenEquipo(int imagenEquipo) {
        this.imagenEquipo = imagenEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

/*    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagenEquipo);
        dest.writeString(nombreEquipo);
    }*/
}
