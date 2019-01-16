package com.example.malizen.darokhanehapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Adaptor extends BaseAdapter {

    String [] result;
    String [] number;
    Context context;
    int [] imageId , bookmark;


    private static LayoutInflater inflater=null;

    public Adaptor(Request history, String[] osNameList, int[] osImages, String[] osnumber , int [] osBookMark) {
        result=osNameList;
        context=history;
        number=osnumber;
        imageId=osImages;
        bookmark=osBookMark;

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
        holder.os_img =(ImageView) rowView.findViewById(R.id.imageView);
        holder.os_bookMark =(ImageView) rowView.findViewById(R.id.bookmarkImg);


        holder.os_text.setText(result[position]);
        holder.num_text.setText(number[position]);
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