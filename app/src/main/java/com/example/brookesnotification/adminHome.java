package com.example.brookesnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adminHome extends AppCompatActivity {
    private Button addstudentbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        addstudentbutton = (Button) findViewById(R.id.addstudentbutton);
        addstudentbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Addstudent();
            }
        });
    }
    public void Addstudent(){
        Intent i = new Intent( adminHome.this, Addstudent.class);
        startActivity(i);

    }

}