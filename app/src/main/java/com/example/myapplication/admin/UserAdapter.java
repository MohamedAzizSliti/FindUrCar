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


public class UserAdapter extends  RecyclerView.Adapter<UserAdapter.ViewHoler> {

    ArrayList<User> users ;

    public UserAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_user, parent, false);
        return new ViewHoler(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        User user = users.get(position);

        holder.image.setImageResource(user.getImage());
        holder.name.setText(user.getName());
        if (user.getType() == "client"){
            holder.type.setText(user.getType());
            holder.type.setTextColor(0xff00ff00);
        }else{
            holder.type.setText(user.getType());
            holder.type.setTextColor(0xffff0000);

        }

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name, type;
        public ViewHoler(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.user_img);
            name = itemView.findViewById(R.id.user_name);
            type = itemView.findViewById(R.id.user_type);


        }
    }
}
