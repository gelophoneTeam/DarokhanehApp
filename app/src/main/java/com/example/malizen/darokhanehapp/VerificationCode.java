package com.example.malizen.darokhanehapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.goodiebag.pinview.Pinview;

public class VerificationCode extends AppCompatActivity {

        private TextView very,sent,num,type;
        private Button ok;
        Pinview pinview;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_verification_code);


            very=(TextView)findViewById(R.id.very);
            type=(TextView)findViewById(R.id.type);
            sent=(TextView)findViewById(R.id.sent);
            num=(TextView)findViewById(R.id.num);
            ok=(Button)findViewById(R.id.ok);


//set fonts
            Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum)_Medium.ttf");
            very.setTypeface(tf);
            type.setTypeface(tf);
            sent.setTypeface(tf);
            num.setTypeface(tf);
            ok.setTypeface(tf);
    }
}
