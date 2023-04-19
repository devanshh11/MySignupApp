package com.example.mysignupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent =getIntent();
        String name=intent.getDataString("name");
        String passs= intent.getDataString("passs");
        MaterialButton login1 = (MaterialButton) findViewById(R.id.login);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(use)

            }
            public void openActivity3()
            {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}