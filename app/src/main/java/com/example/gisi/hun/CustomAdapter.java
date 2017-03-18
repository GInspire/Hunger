package com.example.gisi.hun;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by GISI on 12-02-2016.
 */
public class CustomAdapter extends ArrayAdapter<String>{
Context  c;
    String dishname[];
    int imgS[];
    String linkS[];
    public CustomAdapter(Context context, int resource[], String[] objects, String[] object) {
        super(context,R.layout.single_row,objects);
        this.imgS=resource;
        this.dishname=objects;
        this.linkS=object;
        this.c=context;
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.single_row, null,true);
        ImageView iv=(ImageView) row.findViewById(R.id.imageView);
        TextView tv=(TextView) row.findViewById(R.id.textView);
        Log.e("Entered","Good for now");
        Typeface tf1 = Typeface.createFromAsset(this.getContext().getAssets(),"font1.ttf");
        Log.e("Exited","Exception aa gyi :P");

        iv.setImageResource(imgS[position]);
        tv.setText(dishname[position]);
        tv.setTypeface(tf1);
        return row;
    }
}