package com.example.ejerciciotab.Frames;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaEquipos implements Parcelable {

    public int imagenEquipo;
    public String nombreEquipo ;

    public ListaEquipos(String nombreEquipo, int imagenEquipo){
        this.imagenEquipo = imagenEquipo;
        this.nombreEquipo = nombreEquipo;
    }


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

    protected ListaEquipos(Parcel in) {
        imagenEquipo = in.readInt();
        nombreEquipo = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagenEquipo);
        dest.writeString(nombreEquipo);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ListaEquipos> CREATOR = new Parcelable.Creator<ListaEquipos>() {
        @Override
        public ListaEquipos createFromParcel(Parcel in) {
            return new ListaEquipos(in);
        }

        @Override
        public ListaEquipos[] newArray(int size) {
            return new ListaEquipos[size];
        }
    };
}
