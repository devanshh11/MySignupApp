package com.example.mysignupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        MaterialButton login = (MaterialButton) findViewById(R.id.log);
        //MaterialButton login = (MaterialButton) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //openActivity2();
            }
        //    public void openActivity2()
          //  {
            //    Intent intent=new Intent(MainActivity3.this,MainActivity2.class);
              //  startActivity(intent);
           // }
        });


    }
}