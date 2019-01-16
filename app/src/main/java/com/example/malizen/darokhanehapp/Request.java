package com.example.malizen.darokhanehapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Request extends AppCompatActivity {
    public static int[] osImages = {
            R.drawable.ic_pill,
            R.drawable.ic_pharm,
            R.drawable.ic_pill,
    };


    public static int[] osBookMark = {
            R.drawable.ic_bookmark_yellow,
            R.drawable.ic_bookmark_green,
            R.drawable.ic_bookmark_yellow,

    };

    ListView listview;

    public static String[] osNameList = {
            "نام مشتری : علی معصومی","نام مشتری : علی معصومی","نام مشتری : علی معصومی",

    };

    public static String[] osnumber = {
            "شماره پیگیری : 245782#","شماره پیگیری : 245782#","شماره پیگیری : 245782#",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new Adaptor(this, osNameList, osImages,osnumber,osBookMark));

    }
}
