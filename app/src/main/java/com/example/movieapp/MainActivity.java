package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText t1,t2;
    String uname,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.logButton);
        t1=(EditText) findViewById(R.id.uname);
        t2=(EditText) findViewById(R.id.pass);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname=t1.getText().toString();
                password=t2.getText().toString();
                if(uname.equals("theatre")&& password.equals("123456"))
                {
                    Intent ob1=new Intent(getApplicationContext(),MenuActivity.class);
                    startActivity(ob1);
                }
                else{
                    Toast.makeText(getApplicationContext(),"invalid Credentials",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}