package com.example.malizen.darokhanehapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class NoAdapter extends BaseAdapter {

    String [] result;
    String [] txts;
    String [] txtt;
    String [] txtf;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public NoAdapter(NoNoskhe error, String[] doz, int[] drug, String[] num, String[] name, String[] price) {
        result=doz;
        context=error;
        imageId=drug;
        txts=num;
        txtt=name;
        txtf=price;
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
        TextView texts;
        TextView textt;
        TextView textf;
        ImageView os_img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.list_item, null);
        holder.os_text =(TextView) rowView.findViewById(R.id.doz);
        holder.os_img =(ImageView) rowView.findViewById(R.id.drugImg);
        holder.texts=(TextView)rowView.findViewById(R.id.num);
        holder.textt=(TextView)rowView.findViewById(R.id.name);
        holder.textf=(TextView)rowView.findViewById(R.id.price);

        holder.os_text.setText(result[position]);
        holder.texts.setText(txts[position]);
        holder.textt.setText(txtt[position]);
        holder.textf.setText(txtf[position]);
        holder.os_img.setImageResource(imageId[position]);



        return rowView;
    }

}