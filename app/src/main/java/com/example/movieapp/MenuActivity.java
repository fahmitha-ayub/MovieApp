package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);


        b1=(Button) findViewById(R.id.addbut);
        b2=(Button) findViewById(R.id.searchbut);
        b3=(Button) findViewById(R.id.viewbut);
        b4=(Button) findViewById(R.id.exitbut);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2= new Intent(getApplicationContext(),AddActivity.class);
                startActivity(ob2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob4= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob4);
            }
        });

    }
}