package com.example.myapplication.client.ui.details;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.client.MainActivity;
import com.example.myapplication.R;

public class Detail extends AppCompatActivity {
    private TextView title;
    private ImageView image;
    private TextView prix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//        Button back_btn = findViewById(R.id.back_btn);
        title =findViewById(R.id.Id_title);
        prix =findViewById(R.id.prix);
        image =findViewById(R.id.Id_image);
        Intent iin= getIntent();
        Bundle data = iin.getExtras();


        title.setText((String) data.get("title"));
        prix.setText((String) data.get("prix"));
        image.setImageResource((int) data.get("image"));
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Car Detail ");


//        back_btn.setOnClickListener(view -> {
//            startActivity(new Intent(this, MainActivity.class));
//
//        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                Intent intent=new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
}}