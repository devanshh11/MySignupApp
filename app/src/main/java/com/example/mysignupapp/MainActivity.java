package com.example.mysignupapp;

import static android.text.TextUtils.isEmpty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        EditText repassword = (EditText) findViewById(R.id.repassword);
        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);


        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = username.getText().toString();
                String pass = password.getText().toString();


                if (isEmpty(username1)) {

                    Toast.makeText(MainActivity.this, "Username cannot be empty", Toast.LENGTH_SHORT).show();

                } else if (!password.equals(repassword)) {
                    Toast.makeText(MainActivity.this, "password not same", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Username is " + username1, Toast.LENGTH_SHORT).show();
                    Intent a1=new Intent(MainActivity.this,MainActivity2.class);
                    //String userr=username1.getText().toString();
                    a1.putExtra("name",username1);
                    a1.putExtra("passs",pass);
                    startActivity(a1);
                    openLogin();

            //        openActivity2();

                }
            }
   //         public void openActivity2()
     //       {
       //         Intent intent = new Intent(MainActivity.this, MainActivity2.class);
         //       startActivity(intent);
           // }
        });

        public void openlogin()
        {
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }



    }
}