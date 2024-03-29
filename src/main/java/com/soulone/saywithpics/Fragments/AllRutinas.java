package com.soulone.saywithpics.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soulone.saywithpics.Adapters.RutinaAdapter;
import com.soulone.saywithpics.Models.Rutina;
import com.soulone.saywithpics.R;

import java.util.ArrayList;

public class AllRutinas  extends Fragment {

    //RecyclerView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.all_routines_fragment,container,false);
        RecyclerView recyclerViewRutina = (RecyclerView)view.findViewById(R.id.rv_allRutinas);


        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerViewRutina.setLayoutManager(linearLayoutManager);

        RutinaAdapter rutinaAdapter =
                new RutinaAdapter(buildRutina(),R.layout.item_routine,getActivity());
                 recyclerViewRutina.setAdapter(rutinaAdapter);

        return view;

    }

    public ArrayList<Rutina> buildRutina(){
        ArrayList<Rutina> rutina = new ArrayList<>();
        rutina.add(new Rutina(1,"Rutina de los domingos"));
        rutina.add(new Rutina(2,"Rutina de los lunes"));
        rutina.add(new Rutina(3,"Rutina del colegio"));
        rutina.add(new Rutina(4,"Rutina de los domingos"));
        rutina.add(new Rutina(5,"Rutina de los lunes"));
        rutina.add(new Rutina(6,"Rutina del colegio"));
        rutina.add(new Rutina(7,"Rutina de los domingos"));
        rutina.add(new Rutina(8,"Rutina de los lunes"));
        rutina.add(new Rutina(9,"Rutina del colegio"));
        rutina.add(new Rutina(10,"Rutina de los domingos"));
        rutina.add(new Rutina(11,"Rutina de los lunes"));
        rutina.add(new Rutina(12,"Rutina del colegio"));
        return rutina;
    }
}
