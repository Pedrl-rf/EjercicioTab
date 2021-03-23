package com.example.ejerciciotab.Frames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejerciciotab.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    public List<ListaEquipos> datosEquipoLol;
    public LayoutInflater inflater;
    public Context context;

    public ListAdapter(List<ListaEquipos> itemList, Context context){
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.datosEquipoLol = itemList;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.elementos_equipo, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(datosEquipoLol.get(position));
    }

    @Override
    public int getItemCount() {
        return datosEquipoLol.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconoEquipo;
        TextView nombreEquipo;

        ViewHolder(View itemView){
            super(itemView);
            iconoEquipo = itemView.findViewById(R.id.iconoEquipo);
            nombreEquipo = itemView.findViewById(R.id.nombreEquipo);
        }

        void bindData(final ListaEquipos item){
            nombreEquipo.setText(item.getNombreEquipo());
            iconoEquipo.setImageResource(item.getImagenEquipo());

        }
    }
}
