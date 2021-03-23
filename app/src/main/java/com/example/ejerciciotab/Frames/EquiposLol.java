package com.example.ejerciciotab.Frames;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejerciciotab.R;

import java.util.ArrayList;
import java.util.List;

public class EquiposLol extends Fragment {
    List<ListaEquipos>elements;
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.tavlayoutsegundapantalla, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);

        elements = new ArrayList<>();
        elements.add(new ListaEquipos("G2", R.drawable.g2));
        elements.add(new ListaEquipos("G3", R.drawable.g2));
        elements.add(new ListaEquipos("G4", R.drawable.g2));

        ListAdapter listAdapter = new ListAdapter(elements,getActivity());
        recyclerView.setAdapter(listAdapter);

        return view;
    }


}