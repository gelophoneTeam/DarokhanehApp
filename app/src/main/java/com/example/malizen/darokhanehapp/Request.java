package com.example.malizen.darokhanehapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.mxn.soul.flowingdrawer_core.ElasticDrawer;
import com.mxn.soul.flowingdrawer_core.FlowingDrawer;

public class Request extends AppCompatActivity {
    private FlowingDrawer flowingDrawer;

    public static int[] osImages = {
            R.drawable.ic_group_784,
            R.drawable.ic_group_787,
            R.drawable.ic_group_784,

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
        flowingDrawer = (FlowingDrawer) findViewById(R.id.flowingdrawer);
        flowingDrawer.setTouchMode(ElasticDrawer.TOUCH_MODE_BEZEL);

        setupTolbar();

        //remove appname from toolbar
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        //navigation
        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Toast.makeText(Request.this,item.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

    private void setupTolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        toolbar.setLayoutDirection(Gravity.END);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flowingDrawer.toggleMenu();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (flowingDrawer.isMenuVisible()) {
            flowingDrawer.closeMenu();
        } else {
            super.onBackPressed();
        }
    }
}
