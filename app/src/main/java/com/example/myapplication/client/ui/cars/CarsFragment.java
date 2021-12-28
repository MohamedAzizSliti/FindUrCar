package com.example.myapplication.client.ui.cars;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.client.ui.home.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsFragment extends Fragment {

    private CarsViewModel homeViewModel;
    private  RecyclerView recyclerViewCar;

    public static CarsFragment newInstance() {
        return new CarsFragment();
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cars, container, false);
        recyclerViewCar = (RecyclerView) root.findViewById(R.id.rec);




        setHasOptionsMenu(true);


        com.example.myapplication.client.ui.home.Car car = new com.example.myapplication.client.ui.home.Car(R.drawable.bmw8, "BMW8",100);
            com.example.myapplication.client.ui.home.Car car1 = new com.example.myapplication.client.ui.home.Car(R.drawable.wagonr, "Maruti Suzuki Wagon", 90);
            com.example.myapplication.client.ui.home.Car car2 = new com.example.myapplication.client.ui.home.Car(R.drawable.renault_clio, "Renaulte Clio", 50 );


            List<Car> carData = new ArrayList<>();
            carData.add(car);
            carData.add(car1);
            carData.add(car2);
            carData.add(car);
            carData.add(car1);
            carData.add(car2);
            carData.add(car);
            carData.add(car1);
            carData.add(car2);
            carData.add(car);
            carData.add(car1);
            carData.add(car2);
            carData.add(car);
            carData.add(car1);
            carData.add(car2);
            carData.add(car);
            carData.add(car1);
            carData.add(car2);
            carData.add(car);
            carData.add(car1);
            carData.add(car2);
            carData.add(car);
            carData.add(car1);
            carData.add(car2);

        AdapterCar adapter = new AdapterCar(carData);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
        recyclerViewCar.setLayoutManager(gridLayoutManager);
        recyclerViewCar.setAdapter(adapter);

            ((AppCompatActivity) getActivity()).
                    getSupportActionBar().setTitle("List Of Cars");
            return root;
        }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.exemple_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                adapter.getFilter().filter(query);
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String query) {
//                adapter.getFilter().filter(query);
//                return false;
//            }
//        });

    }



}