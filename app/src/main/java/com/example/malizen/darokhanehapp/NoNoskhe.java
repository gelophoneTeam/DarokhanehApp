package com.example.malizen.darokhanehapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class NoNoskhe extends Activity {


    public static int[] drug = {
            R.drawable.ic_erpill,
            R.drawable.ic_erpill,
            R.drawable.ic_erpill,
    };
    public static String[] doz= {
            "400 mg",
            "200 mg",
            "250 mg",
            "400 mg",
            "200 mg",
            "250 mg",
    };
    public static String[] num = {
            "30  عدد",
            "30  عدد",
            "30  عدد",
            "30  عدد",
            "30  عدد",
            "30  عدد",
    };
    public static String[] name = {
            "ژلوفن (Gelophen)",
            "لوتیروکسین (Levothiroxin)",
            "آموکسی سیلین (Amoxi)",
            "ژلوفن (Gelophen)",
            "لوتیروکسین (Levothiroxin)",
            "آموکسی سیلین (Amoxi)",
    };
    public static String[] price = {
            "3000",
            "3000",
            "3000",
            "3000",
            "3000",
            "3000",
    };
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_noskhe);

        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new NoAdapter(this, doz,drug,num,name,price));

    }
}
