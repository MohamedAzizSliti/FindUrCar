package com.example.myapplication.client.ui.home;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.client.ui.details.Detail;

import java.util.List;

public class AdapterCar extends RecyclerView.Adapter<AdapterCar.Viewholder> {

    public AdapterCar(List<Car> cars) {
        this.cars = cars;
    }

    List<Car> cars;


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.carh_item, parent, false);
        Viewholder viewHolder = new Viewholder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        final Car car = cars.get(position);
        holder.title.setText(car.getTitle());
        holder.prix.setText(String.valueOf(car.getPrice()));
        holder.image.setImageResource(car.getImage());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Detail.class);
                intent.putExtra("title", car.getTitle());
                intent.putExtra("prix", holder.prix.getText());
                intent.putExtra("image", car.getImage());

                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
        private TextView title;
        private ImageView image;
        private TextView prix;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title =itemView.findViewById(R.id.Id_title);
            prix =itemView.findViewById(R.id.Id_prix);
            image =itemView.findViewById(R.id.Id_image);


        }

    }

}


