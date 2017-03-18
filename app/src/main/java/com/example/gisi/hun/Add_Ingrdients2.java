package com.example.gisi.hun;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

import data.FeedData;
import data.OpenHelp;

public class Add_Ingrdients2 extends ActionBarActivity {

   int arr[];
    String dishN[];
    int imgS[];
    String linkS[];
    int count;
    int noOfNonZero;
    int c;
    FeedData fd=new FeedData();
    String col[]={"INGREDIENT_NAME","GHEE","BASMATI_RICE","BANANA_MILK","BACON_FRIED_BANANA","AMAZING_BANANA","CHOCOLATE_BANANA","CAKE_MIX_BANANA",
            "BestGrilledHamburger",
            "MeltedWitch",
            "MorningSunshine",
            "HomemadeStewedTomatoes",
            "RotelTomatoes",
            "FriedBacon",
            "Breadcrumbs",
            "SoftBreadCrumbs",
            "Applesauce",
            "SoftAppleSlices",
            "Cappuccino",
            "CafeLatte",
            "BakedPotato",
            "ScreamingPotatoes",
            "AppleCarrotJuice",
            "WholeWheatChapatis",
            "HomemadeSeitan",
            "HomemadeNoodles",
            "Rivilchas",
            "BasicPasta",
            "BakedEggsinBaconWraps",
            "BaconFiletMignon",
            "CreamyCandyBarSauce",
            "LowFatChipDip",
            "CreamBiscuits",
            "BananaMilkshake",
            "CremeFraiche",
            "RoastPorkLoinChop",
            "FriedMashedPotatoes",
            "CaramelizedOnions",
            "PurestPeaPuree",
            "TomatoVegetableMeatlessMeatballSoup",
            "PeasandCarrotRibbons",
            "VinaigretteOnions",
            "DeepFriedPickles",
            "PeanutbutterandPicklesandwich",
            "CreamCheeseWrappedDillPickles",
            "EasiestSouffleEver",
            "CreamyCaramelAppleDip",
            "BaconOlivePartySandwiches",
            "BrownedButteredEggNoodles",
            "ButterNoodles",
            "ArmenianRiceandNoodles",
            "SpinachandSweetPotatoes",
            "UniqueSpinachNoodles",
            "StuffedPeaPods",
            "DeepFriedSpinach",
            "BaconandSpinachDip",
            "SugarPeanuts",
            "HomemadePeanutButter",
            "BoiledPeanuts",
            "VegetableRiceMedley",
            "RootVegetableSmash",
            "HoboStew"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredients2);
        arr= getIntent().getIntArrayExtra("Val");


    }
    public int count()
    {
        for(int i=0;i<61;i++)
        {
            if(arr[i]!=0)
                c++;

        }
        Toast.makeText(this,"Value counted"+c,Toast.LENGTH_LONG).show();
        return c;
    }

    public void done()
    {

       for(int i=0;i<61;i++)
       {
           if(arr[i]!=0)
           {
              dishN[count]= fd.dishName[i];
               imgS[count]=fd.imgSource[i];
               linkS[count]=fd.link[i];
               count++;

           }
       }
        Toast.makeText(this," "+count,Toast.LENGTH_LONG).show();
    }

    public void pickel(View v)
    {
        Toast.makeText(this,"PICKLE",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[21]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void cheese(View v)
    {
        Toast.makeText(this,"CHEESE",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[22]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void noodle(View v)
    {
        Toast.makeText(this,"NOODLE",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[23]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void spinach(View v)
    {
        Toast.makeText(this,"SPINACH",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[24]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void peanuts(View v)
    {
        Toast.makeText(this,"PEANUTS",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[25]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void mixedvegetable(View v)
    {
        Toast.makeText(this,"MIXED_VEGETABLE",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[26]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }
    public void flour(View v)
    {
        Toast.makeText(this,"FLOUR",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[16]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }
    public void bacon(View v)
    {
        Toast.makeText(this,"BACON",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[17]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void onion(View v)
    {
        Toast.makeText(this,"ONION",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[19]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void cream(View v)
    {
        Toast.makeText(this,"CREAM",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[18]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void peas(View v)
    {
        Toast.makeText(this,"PEAS",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[20]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr[i-1]++;

                }
                break;
            }
        }
        c.close();
    }
    public void next(View v)
    {
        c=0;
        noOfNonZero=count();
        count=0;

        dishN =new String[noOfNonZero];
        imgS=new int[noOfNonZero];
        linkS=new String[noOfNonZero];
        done();
        Intent i=new Intent(this,gridViewClass.class);
        i.putExtra("DishNames",dishN);
        i.putExtra("ImgSource",imgS);
        i.putExtra("LinkSource",linkS);
        startActivity(i);
    }
}
