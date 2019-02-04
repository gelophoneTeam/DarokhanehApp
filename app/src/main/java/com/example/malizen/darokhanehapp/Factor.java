package com.example.malizen.darokhanehapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Factor extends Activity {


    //list Item
    public static int[] osImages = {
            R.drawable.ic_test,
            R.drawable.ic_test,
            R.drawable.ic_test,
    };

    public static int[] osBookMark = {
            R.drawable.ic_bookmark_yellow,
            R.drawable.ic_bookmark_green,
            R.drawable.ic_bookmark_yellow,

    };
    public static String[] osDate={
            "18/11/97","18/11/97","18/11/97",
    };
    public static String[] osNameList = {
            "نام مشتری : علی معصومی","نام مشتری : علی معصومی","نام مشتری : علی معصومی",

    };

    public static String[] osnumber = {
            "شماره پیگیری : 245782#","شماره پیگیری : 245782#","شماره پیگیری : 245782#",

    };
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factor);
        //listAdaptor

        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new FactorAdapter(this, osNameList,osDate, osImages,osnumber,osBookMark));

    }
}
