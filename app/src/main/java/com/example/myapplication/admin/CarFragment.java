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
import java.util.List;


public class CarFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_car,container,false);

        RecyclerView cars_receycler = rootView.findViewById(R.id.cars_recycler_view);

        ArrayList<Car> data = new ArrayList<>();
        data.add(new Car(R.drawable.mazda, "Mazda", "2 ports  diesel", "Available"));
        data.add(new Car(R.drawable.merceds, "merceds", "4 ports  gasoline", "Unavailable"));
        data.add(new Car(R.drawable.audi, "audi", "4 ports  gasoline", "Unavailable"));
        data.add(new Car(R.drawable.volvo, "volvo", "4 ports 7 PLace diesel", "Unavailable"));
        data.add(new Car(R.drawable.polo, "polo", "4 ports  diesel", "Available"));

        CarAdapter carAdapter = new CarAdapter(data);

        cars_receycler.setLayoutManager(new LinearLayoutManager(getContext()));

        cars_receycler.setAdapter(carAdapter);

        return rootView;

    }



    }

