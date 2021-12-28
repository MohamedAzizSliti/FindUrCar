package com.example.myapplication.client.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


public class ProfileFragment extends Fragment {

    public static ProfileFragment newInstance() { return new ProfileFragment();
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
//        ActionBar actionBar = getSupportActionBar();
//        if (actionBar != null) {
//            actionBar.setHomeButtonEnabled(true);
//            actionBar.setTitle(getChildFragmentManager().toString());
//        }
        ((AppCompatActivity) getActivity()).
                getSupportActionBar().setTitle("Profile");

        return root;
    }


}