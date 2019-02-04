package com.example.malizen.darokhanehapp;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(MainActivity.this);

                dialog.setContentView(R.layout.alert_box);
                dialog.getWindow().setLayout(1000, 1300);
                dialog.setTitle("Custom Dialog");


                Button dismissButton = (Button) dialog.findViewById(R.id.abb);
                dismissButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "درخواست شما ارسال شد.", Toast.LENGTH_SHORT).show();

                        dialog.dismiss();

                    }
                });

                Button dismissButton1 = (Button) dialog.findViewById(R.id.abn);
                dismissButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "شما درخواستی ثبت نکردید.", Toast.LENGTH_SHORT).show();


                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}
