package com.example.malizen.darokhanehapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class Noskhe extends Activity {
    public static int[] drug = {
            R.drawable.ic_erpill,
            R.drawable.ic_erpill,
            R.drawable.ic_erpill,
    };
    public static String[] doz = {
            "400 mg",
            "200 mg",
            "250 mg",
    };
    public static String[] num = {
            "30  عدد",
            "30  عدد",
            "30  عدد",
    };
    public static String[] name = {
            "ژلوفن (Gelophen)",
            "لوتیروکسین (Levothiroxin)",
            "آموکسی سیلین (Amoxi)",
    };
    public static String[] price = {
            "400 mg",
            "200 mg",
            "250 mg",
    };
    ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noskhe);

        ImageView pill=(ImageView)findViewById(R.id.pill);


        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new ErAdapter(this, doz,drug,num,name,price));

    }
}
