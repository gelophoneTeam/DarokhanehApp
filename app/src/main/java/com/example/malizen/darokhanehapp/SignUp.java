package com.example.malizen.darokhanehapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

  private EditText phone,name,email,password;
  private TextView log,had,img;
  Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        phone=(EditText)findViewById(R.id.phones);
        password=(EditText)findViewById(R.id.passwords);
        name=(EditText)findViewById(R.id.name);
       email=(EditText)findViewById(R.id.email);
        log=(TextView)findViewById(R.id.log);
       had=(TextView)findViewById(R.id.had);
        img=(TextView)findViewById(R.id.img);
        signUp=(Button)findViewById(R.id.signUp);


//set fonts
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum)_Medium.ttf");
        phone.setTypeface(tf);
        password.setTypeface(tf);
       name.setTypeface(tf);
        log.setTypeface(tf);
         email.setTypeface(tf);
         had.setTypeface(tf);
         img.setTypeface(tf);
         signUp.setTypeface(tf);
    }
}
