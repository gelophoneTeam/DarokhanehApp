package com.example.malizen.darokhanehapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

EditText phone,password;
TextView forgot;
Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        phone=(EditText)findViewById(R.id.phone);
        password=(EditText)findViewById(R.id.password);
        forgot=(TextView)findViewById(R.id.forgot);
        logIn=(Button)findViewById(R.id.logIn);


//set fonts
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum).ttf");
       phone.setTypeface(tf);
       password.setTypeface(tf);
       forgot.setTypeface(tf);
        logIn.setTypeface(tf);

    }
}
