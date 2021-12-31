package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.client.MainActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView tvSignup = findViewById(R.id.tv_signup);
        TextView loginbtn = findViewById(R.id.tv_valider);
        EditText username =findViewById(R.id.edt_email);
        EditText pw =findViewById(R.id.edt_password);



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name=username.getText().toString();
                String pass=pw.getText().toString();
                //                Go to MainActivity
                if((name.equals("admin"))&&(pass.equals("admin")))
                {
                    Intent loginIntent = new Intent(login.this, com.example.myapplication.admin.MainActivity.class);
                startActivity(loginIntent);

                finish();}
                else {
                    Intent loginIntent = new Intent(login.this, MainActivity.class);
                    startActivity(loginIntent);

                    finish();
                }

            }
        });

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this, register.class));
            }
        });
    }
}