package com.example.gisi.hun;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class gridViewClass extends Activity {
    GridView l;
    String dishName[];
    public int imgSource[];
    public String linkSource[];
    public gridViewClass(){}

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_class);
        dishName= getIntent().getStringArrayExtra("DishNames");
        imgSource=getIntent().getIntArrayExtra("ImgSource");
        linkSource=getIntent().getStringArrayExtra("LinkSource");

        CustomAdapter adapter=new CustomAdapter(this,imgSource,dishName,linkSource);//1 by 1
        l=(GridView)findViewById(R.id.gridView);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(linkSource[position]));
                startActivity(i);

            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this,Add_Ingredients.class));
    }
}
