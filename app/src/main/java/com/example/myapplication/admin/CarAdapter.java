package com.example.myapplication.admin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class CarAdapter extends  RecyclerView.Adapter<CarAdapter.ViewHoler> {

    ArrayList<Car> cars ;

    public CarAdapter(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_car, parent, false);
        return new ViewHoler(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        Car car = cars.get(position);

        holder.image.setImageResource(car.getImage());
        holder.title.setText(car.getTitle());
        holder.detail.setText(car.getDetail());
        if (car.getState() == "Available"){
            holder.state.setText(car.getState());
            holder.state.setTextColor(0xff00ff00);
        }else{
            holder.state.setText(car.getState());
            holder.state.setTextColor(0xffff0000);
        }

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder{

ImageView image;
TextView title, detail, state;
        public ViewHoler(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.item_car_img);
            title = itemView.findViewById(R.id.item_car_title);
            detail = itemView.findViewById(R.id.item_car_details);
            state = itemView.findViewById(R.id.item_car_state);


        }
    }
}
