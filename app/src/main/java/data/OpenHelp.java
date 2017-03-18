package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class OpenHelp extends SQLiteOpenHelper {

   public OpenHelp(Context context) {

        super(context,"ingri6.db",null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL("CREATE TABLE INGREDIENT(INGREDIENT_NAME TEXT,GHEE INT,BASMATI_RICE INT,BANANA_MILK INT,BACON_FRIED_BANANA INT,AMAZING_BANANA INT," +
             "CHOCOLATE_BANANA INT,CAKE_MIX_BANANA INT,BestGrilledHamburger INT,MeltedWitch INT, MorningSunshine INT, HomemadeStewedTomatoes INT, RotelTomatoes INT, FriedBacon INT, Breadcrumbs INT, SoftBreadCrumbs INT, Applesauce INT," +
             " SoftAppleSlices INT," +
            " Cappuccino INT, CafeLatte INT, BakedPotato INT, ScreamingPotatoes INT, AppleCarrotJuice INT,"+
             "WholeWheatChapatis INT,"+
             "HomemadeSeitan INT,"+
             "HomemadeNoodles INT,"+
             "Rivilchas INT,"+
             "BasicPasta INT,"+
             "BakedEggsinBaconWraps INT,"+
             "BaconFiletMignon INT,"+
             "CreamyCandyBarSauce INT,"+
             "LowFatChipDip INT,"+
             "CreamBiscuits INT,"+
             "BananaMilkshake INT,"+
             "CremeFraiche INT,"+
             "RoastPorkLoinChop INT,"+
             "FriedMashedPotatoes INT,"+
             "CaramelizedOnions INT,"+
             "PurestPeaPuree INT,"+
             "TomatoVegetableMeatlessMeatballSoup INT,"+
            "PeasandCarrotRibbons INT,"+
             "VinaigretteOnions INT,"+
             "DeepFriedPickles INT,"+
             "PeanutbutterandPicklesandwich INT,"+
             "CreamCheeseWrappedDillPickles INT,"+
             "EasiestSouffleEver INT," +
                     "CreamyCaramelAppleDip INT,"+
             "BaconOlivePartySandwiches INT,"+
             "BrownedButteredEggNoodles INT,"+
             "ButterNoodles INT,"+
             "ArmenianRiceandNoodles INT,"+
             "SpinachandSweetPotatoes INT,"+
             "UniqueSpinachNoodles INT,"+
             "StuffedPeaPods INT,"+
             "DeepFriedSpinach INT,"+
             "BaconandSpinachDip INT,"+
             "SugarPeanuts INT,"+
             "HomemadePeanutButter INT,"+
             "BoiledPeanuts INT,"+
             "VegetableRiceMedley INT,"+
             "RootVegetableSmash INT,"+
             "HoboStew INT"+
             ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
