package data;

/**
 * Created by GISI on 04-02-2016.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class OpenHelper extends SQLiteOpenHelper {


    public OpenHelper(Context context)
    {
        super(context,"dish6.db", null, 1);
        // TODO Auto-generated constructor stub
    }




    @Override
    public void onCreate(SQLiteDatabase a) {
        // TODO Auto-generated method stub
        a.execSQL("CREATE TABLE DISH(DISH_NAME TEXT,IMG_SRC INT,DISH_LINK BLOB)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub


    }

}

