package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private  RecyclerView recyclerView,recyclerView1;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) root.findViewById(R.id.rec1);
        recyclerView1 = (RecyclerView) root.findViewById(R.id.rec);



//       Recyclerview divider
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        Car car = new Car(R.drawable.bmw8, "BMW8",100);
        Car car1 = new Car(R.drawable.wagonr, "Maruti Suzuki Wagon", 90);
        Car car2 = new Car(R.drawable.renault_clio, "Renaulte Clio", 50 );


        List<Car> carData = new ArrayList<>();
        carData.add(car);
        carData.add(car1);
        carData.add(car2);
        carData.add(car);
        carData.add(car1);
        carData.add(car2);

        AdapterCar adapter = new AdapterCar(carData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);


//

        AdapterCarH adapterH = new AdapterCarH(carData);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setAdapter(adapterH);
        ((AppCompatActivity) getActivity()).
                getSupportActionBar().setTitle("Home");

        return root;
    }

}