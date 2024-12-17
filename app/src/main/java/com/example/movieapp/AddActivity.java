package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {
    Button b1,b2;
    EditText t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        b1=(Button) findViewById(R.id.subbut);
        b2=(Button) findViewById(R.id.backButton);
        t1=(EditText) findViewById(R.id.mname);
        t2=(EditText) findViewById(R.id.lang);
        t3=(EditText) findViewById(R.id.dir);
        t4=(EditText) findViewById(R.id.actor);
        t5=(EditText) findViewById(R.id.actress);
        t6=(EditText) findViewById(R.id.date);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3= new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(ob3);
            }
        });
    }
}