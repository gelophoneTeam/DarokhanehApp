package com.example.malizen.darokhanehapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FactorAdapter extends BaseAdapter {

    String [] result;
    String [] number;
    String[] date;
    Context context;
    int [] imageId , bookmark;


    private static LayoutInflater inflater=null;
    public FactorAdapter(Factor factor, String[] osNameList,String[] osdate, int[] osImages, String[] osnumber , int [] osBookMark) {
        result=osNameList;
        context=factor;
        number=osnumber;
        imageId=osImages;
        bookmark=osBookMark;
        date=osdate;

        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }



    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    public class Holder
    {
        TextView os_text;
        TextView num_text;
        TextView os_date;
        ImageView os_img;
        ImageView os_bookMark;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.listorder, null);
        holder.os_text =(TextView) rowView.findViewById(R.id.txt1);
        holder.num_text =(TextView) rowView.findViewById(R.id.txt2);
        holder.os_date =(TextView) rowView.findViewById(R.id.date);
        holder.os_img =(ImageView) rowView.findViewById(R.id.imageView);
        holder.os_bookMark =(ImageView) rowView.findViewById(R.id.bookmarkImg);


        holder.os_text.setText(result[position]);
        holder.num_text.setText(number[position]);
        holder.os_date.setText(date[position]);
        holder.os_img.setImageResource(imageId[position]);
        holder.os_bookMark.setImageResource(bookmark[position]);

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "انتخاب شد "+result[position], Toast.LENGTH_SHORT).show();
            }
        });

        return rowView;
    }
}