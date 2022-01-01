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


public class UserFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_user,container,false);

        RecyclerView users_receycler = rootView.findViewById(R.id.users_recycler_view);

        ArrayList<User> data = new ArrayList<>();
data.add(new User(R.drawable.avatar1,"ali","client"));
        data.add(new User(R.drawable.avatar2,"najwa","Admin"));
        data.add(new User(R.drawable.avatar3,"mohamed","Admin"));
        data.add(new User(R.drawable.avatar4,"Moez","client"));
        data.add(new User(R.drawable.avatar5,"Fakher","client"));


        UserAdapter userAdapter = new  UserAdapter(data);

        users_receycler.setLayoutManager(new LinearLayoutManager(getContext()));

        users_receycler.setAdapter(userAdapter);

        return rootView;

    }



}
