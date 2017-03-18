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

public class Add_Ingredients extends ActionBarActivity {
     public int arr_Count[]=new int[61];

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
        setContentView(R.layout.activity_add_ingredients);
        arr_Count=new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
          FeedData fd=new FeedData();
        fd.FeedData(this);
        Toast.makeText(this,"DONE",Toast.LENGTH_LONG).show();
    }

    public void reload(View v)
    {

         Intent i=new Intent(this, Add_Ingrdients2.class);

          i.putExtra("Val",arr_Count);
        startActivity(i);
    }



    public void butter(View v)
    {
        Toast.makeText(this,"BUTTER",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
      while(c.moveToNext())
      {
          String ingName=c.getString(0);
          if(ingName.equals(new FeedData().ingredients[1]))
          {
             for(int i=1;i<62;i++)
             {
                 int value=c.getInt(i);
                 if(value==1)
                     arr_Count[i-1]++;

             }
              break;
          }
      }
        c.close();
    }
    public void tomatoes(View v)
    {
        Toast.makeText(this,"TOMATOES",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[6]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void vegetableOil(View v)
    {
        Toast.makeText(this,"VEGETABLEOIL",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[7]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void bread(View v)
    {
        Toast.makeText(this,"BREAD",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[9]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void apple(View v)
    {
        Toast.makeText(this,"APPLE",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[10]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void milk(View v)
    {
        Toast.makeText(this,"MILK",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[11]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void potato(View v)
    {
        Toast.makeText(this,"POTATO",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[12]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void carrot(View v)
    {
        Toast.makeText(this,"CARROT",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[13]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void beef(View v)
    {
        Toast.makeText(this,"BEEF",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[14]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }

    public void chocolate(View v)
    {
        Toast.makeText(this,"CHOCOLATE",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[15]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }
    public void oliveOil(View v)
    {
        Toast.makeText(this,"OLIVEOIL",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[4]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }
    public void lemon(View v)
    {
        Toast.makeText(this,"LEMON",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[5]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }
    public void rice(View v)
    {
        Toast.makeText(this,"RICE",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[3]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }
    public void eggs(View v)
    {
        Toast.makeText(this,"EGGS",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[2]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }
    public void banana(View v)
    {
        Toast.makeText(this,"BANANA",Toast.LENGTH_SHORT).show();
        OpenHelp op=new OpenHelp(this);
        SQLiteDatabase db=op.getReadableDatabase();
        Cursor c=db.query("INGREDIENT",col,null,null,null,null,null);
        while(c.moveToNext())
        {
            String ingName=c.getString(0);
            if(ingName.equals(new FeedData().ingredients[0]))
            {
                for(int i=1;i<62;i++)
                {
                    int value=c.getInt(i);
                    if(value==1)
                        arr_Count[i-1]++;

                }
                break;
            }
        }
        c.close();
    }


}
