package com.example.myapplication.admin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;


public class AgenceFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_agence,container,false);
        RecyclerView agences_recycler=rootView.findViewById(R.id.agence_recycler_view);
        ArrayList<Agence> data= new ArrayList<>();
        data.add(new Agence(R.drawable.agence1,"Automobile","Binzerte"));
        data.add(new Agence(R.drawable.agence2,"Fat car","Tunis"));
        data.add(new Agence(R.drawable.agence3,"Ada car","Sfax"));
        data.add(new Agence(R.drawable.agence4,"Douchir mobile","Hammemet"));
        data.add(new Agence(R.drawable.agence5,"Rental Mejri","Elkef"));
AgenceAdapter agenceAdapter=new AgenceAdapter(data);
agences_recycler.setLayoutManager(new LinearLayoutManager(getContext()));
agences_recycler.setAdapter(agenceAdapter);
        return rootView;
    }
}
