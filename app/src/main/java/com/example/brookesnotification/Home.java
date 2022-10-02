package com.example.brookesnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
private Button adminbutton;
private Button unionbutton;
private Button studentbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        adminbutton = (Button) findViewById(R.id.buttonadmin);
        adminbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openAdminlog();
            }
        });
        unionbutton = (Button) findViewById(R.id.unionbutton);
        unionbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openunionlog();
            }
        });
        studentbutton = (Button) findViewById(R.id.studentbutton);
        studentbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openstudentlog();
            }
        });
    }
    public void openAdminlog(){
        Intent i = new Intent( Home.this, Admin.class);
        startActivity(i);
    }
    public void openunionlog(){
        Intent i = new Intent( Home.this, Unionlog.class);
        startActivity(i);
    }
    public void openstudentlog(){
        Intent i = new Intent( Home.this, studentlog.class);
        startActivity(i);
    }
}