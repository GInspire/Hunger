package data;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.gisi.hun.R;

public class FeedData
        {
            Context con;
            public FeedData()
            {

            }
            public String ingredients[] = {"BANANA", "BUTTER", "EGGS", "RICE","OLIVE_OIL","LEMON","TOMATO","VEGETABLE_OIL","KETCHUP","BREAD","APPLE","MILK","POTATO","CARROT","BEEF","CHOCOLATE","FLOUR","BACON","CREAM","ONION","PEAS","PICKEL","CHEESE","NOODLE","SPINACH","PEANUTS","MIXEDVEGETABLE"};
            public String dishName[]={"GHEE","BASMATI_RICE","BANANA_MILK","BACON_FRIED_BANANA","AMAZING_BANANA","CHOCOLATE_BANANA","CAKE_MIX_BANANA",
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
            public Integer[] imgSource={R.drawable.ghee,R.drawable.basmatirice,R.drawable.bananamilk,R.drawable.baconfriedbanana,R.drawable.bananasorbet,R.drawable.chocolatebanana,R.drawable.cakemixbanana
                    ,R.drawable.hamburger,
                     R.drawable.meltedwitch,R.drawable.morningsunshine,R.drawable.stewedtomato,R.drawable.roteltomatoes,R.drawable.friedbacon,R.drawable.breadcrumbs,R.drawable.softbreadcrumbs,R.drawable.applesauce,
                    R.drawable.softappleslices,
                    R.drawable.cappuccino,R.drawable.cafelatte,R.drawable.bakedpotato,R.drawable.screamingpotatoes,R.drawable.applecarrot,
                    R.drawable.wheatchapatis,
                    R.drawable.homemadeseitan,R.drawable.homemadenoodles,R.drawable.rivilchas,R.drawable.basicpasta,
                    R.drawable.bakedeggs,R.drawable.baconfilet,R.drawable.creamycandy,R.drawable.chipdip,R.drawable.creamebiscuit,R.drawable.bananamilkshake,
                    R.drawable.cremefriache,R.drawable.loinchop,R.drawable.mashedpotatoes,R.drawable.carmalizedonion,R.drawable.peapuree,
                    R.drawable.meatballsoup,
                    R.drawable.carrotribbons,
                    R.drawable.vonion,R.drawable.friedpickle,R.drawable.picklesandwich,
                    R.drawable.dillpickle,R.drawable.souffleever,
                    R.drawable.creamycaramel,R.drawable.baconsandwich,R.drawable.brownednoodles,R.drawable.butternoodles,R.drawable.armenianrice,
                    R.drawable.spinachpotato,R.drawable.uniquespinach,R.drawable.stuffedpea,R.drawable.deepfried,R.drawable.baconspinachdip,R.drawable.sugarpeanuts,
                    R.drawable.peanutbutter,R.drawable.boiledpeanuts,R.drawable.vegetablemedley,R.drawable.rootvegetable,R.drawable.hobostew
            };
            public String link[]={"http://www.marthastewart.com/332877/ghee",
                    "http://www.epicurious.com/recipes/food/views/Basmati-Rice-232006",
                    "http://www.food.com/recipe/banana-milk-raw-dairy-free-443988",
                    "http://allrecipes.com/recipe/bacon-fried-bananas/detail.aspx",
                    "http://allrecipes.com/recipe/37672/amazing-banana-sorbet/",
                    "http://www.food.com/recipe/chocolate-banana-ice-cream-512817",
                    "http://www.food.com/recipe/cake-mix-banana-bread-284481",
                    "http://www.food.com/recipe/the-best-grilled-hamburgers-414424",
                "http://allrecipes.com/recipe/20418/melted-witch/",
                "http://www.food.com/recipe/morning-sunshine-hot-lemon-drink-59070",
                "http://allrecipes.com/recipe/21145/homemade-stewed-tomatoes/",
                "http://www.food.com/recipe/rotel-tomatoes-homemade-copycat-20049",
                "http://www.marthastewart.com/315201/fried-bacon",
                "http://www.marthastewart.com/316259/breadcrumbs",
                "http://www.food.com/recipe/soft-bread-crumbs-392730",
                "http://www.food.com/recipe/applesauce-for-canning-98859",
                "http://www.food.com/recipe/soft-apple-slices-238883",
                "http://www.marthastewart.com/335253/cappuccino",
                "http://www.kraftrecipes.com/recipes/cafe-latte-54971.aspx",
                "http://allrecipes.com/recipe/16505/baked-potato/",
                "http://www.food.com/recipe/screaming-potatoes-67223",
                "http://www.food.com/recipe/apple-carrot-juice-188116",
                   "http://www.myrecipes.com/recipe/whole-wheat-chapatis",
           "http://www.cookstr.com/recipes/homemade-seitan",
            "http://www.food.com/recipe/homemade-noodles-27344",
            "http://www.food.com/recipe/rivilchas-140570",
            "http://allrecipes.com/recipe/11899/basic-pasta/",
            "http://www.food.com/recipe/baked-eggs-in-bacon-wraps-150765",
            "http://www.food.com/recipe/bacon-filet-mignon-45980",
            "http://www.thekitchn.com/easy-dessert-recipe-creamy-candy-bar-sauce-recipes-from-the-kitchn-195333",
            "http://www.food.com/recipe/low-fat-chip-dip-lipton-onion-soup-dip-53842",
            "http://allrecipes.com/recipe/162395/e-z-cream-biscuits/?evt19=1",
            "http://www.food.com/recipe/banana-milkshake-layered-shot-185488",
            "http://www.food.com/recipe/creme-fraiche-62515",
            "http://allrecipes.com/recipe/21648/roast-pork-loin-chop/",
            "http://www.food.com/recipe/fried-mashed-potatoes-13796",
            "http://www.food.com/recipe/caramelized-onions-4725",
            "http://www.marthastewart.com/355393/purest-pea-puree",
            "http://vegweb.com/recipes/tomato-vegetable-meatless-meatball-soup",
           "http://www.marthastewart.com/313330/peas-and-carrot-ribbons",
            "http://www.cookstr.com/recipes/vinaigrette-onions",
            "http://www.foodnetwork.com/recipes/deep-fried-pickles-recipe.html",
            "http://vegweb.com/recipes/peanut-butter-and-pickle-sandwich",
            "http://www.food.com/recipe/cream-cheese-wrapped-dill-pickles-448257",
            "http://www.kraftrecipes.com/recipes/easiest-souffle-ever-132493.aspx",
                    "http://www.food.com/recipe/creamy-caramel-apple-dip-101345",
            "http://www.myrecipes.com/recipe/bacon-olive-party-sandwiches",
            "http://www.food.com/recipe/browned-buttered-egg-noodles-64252",
            "http://www.food.com/recipe/butter-noodles-182647",
            "http://www.food.com/recipe/armenian-rice-and-noodles-78147",
            "http://www.myrecipes.com/recipe/spinach-sweet-potatoes",
            "http://allrecipes.com/recipe/11761/unique-spinach-noodles/",
            "http://allrecipes.com/recipe/19875/stuffed-pea-pods/",
            "http://allrecipes.com/recipe/52955/deep-fried-spinach/",
            "http://www.food.com/recipe/cream-cheese-bacon-and-spinach-dip-275872",
            "http://allrecipes.com/recipe/53169/sugar-peanuts/",
            "http://allrecipes.com/recipe/203349/homemade-peanut-butter/?evt19=1",
            "http://www.myrecipes.com/recipe/boiled-peanuts-0",
            "http://www.food.com/recipe/vegetable-rice-medley-44614",
            "http://www.myrecipes.com/recipe/root-vegetable-smash",
            "http://allrecipes.com/recipe/106038/hobo-stew/"
            };
            public void FeedData(Context context) {
                con = context;

                int ghee[] = {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int basmatiRice[] = {0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int bananaMilk[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int baconfriedBanana[] = {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int amazingBanana[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int chocolateBanana[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0};
                int cakeMixBanana[] = {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0};
                int BestGrilledHamburger[]={0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0};
                int MeltedWitch[]={0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int MorningSunshine[]={0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int HomemadeStewedTomatoes[]={0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int RotelTomatoes[]={0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int FriedBacon[]={0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int Breadcrumbs[]={0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int SoftBreadCrumbs[]={0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int Applesauce[]={0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
               int SoftAppleSlices[]={0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int Cappuccino[]={0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int CafeLatte[]={0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int BakedPotato[]={0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int ScreamingPotatoes[]={0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int AppleCarrotJuice[]={0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int WholeWheatChapatis[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0};
                int HomemadeSeitan[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0};
                int HomemadeNoodles[]={0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int Rivilchas[]={0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0};
                int BasicPasta[]={0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0};
                int BakedEggsinBaconWraps[]={0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0};
                int BaconFiletMignon[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0};
                int CreamyCandyBarSauce[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0};
                int LowFatChipDip[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0};
                int CreamBiscuits[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0};
                int BananaMilkshake[]={1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0};
                int CremeFraiche[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0};
                int RoastPorkLoinChop[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};
                int FriedMashedPotatoes[]={0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0};
                int CaramelizedOnions[]={0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};
                int PurestPeaPuree[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
                int TomatoVegetableMeatlessMeatballSoup[]={0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
                int PeasandCarrotRibbons[]={0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0};
                int VinaigretteOnions[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0};
                int DeepFriedPickles[]={0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0};
                int PeanutbutterandPicklesandwich[]={0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0};
                int CreamCheeseWrappedDillPickles[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0};
                int EasiestSouffleEver[]={0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0};
                int CreamyCaramelAppleDip[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0};
                int BaconOlivePartySandwiches[]={0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0};
                int BrownedButteredEggNoodles[]={0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0};
                int ButterNoodles[]={0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0};
                int ArmenianRiceandNoodles[]={0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0};
                int SpinachandSweetPotatoes[]={0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0};
                int UniqueSpinachNoodles[]={0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0};
                int StuffedPeaPods[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0};
                int DeepFriedSpinach[]={0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0};
                int BaconandSpinachDip[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,0,1,0,0};
                int SugarPeanuts[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0};
                int HomemadePeanutButter[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0};
                int BoiledPeanuts[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0};
                int VegetableRiceMedley[]={0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
                int RootVegetableSmash[]={0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1};
                int HoboStew[]={0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1};

                for (int i = 0; i <27; i++) {
                    OpenHelp h = new OpenHelp(con);
                    SQLiteDatabase db = h.getWritableDatabase();

                    ContentValues c = new ContentValues();
                    c.put("INGREDIENT_NAME", ingredients[i]);
                    c.put("GHEE", ghee[i]);
                    c.put("BASMATI_RICE", basmatiRice[i]);
                    c.put("BANANA_MILK", bananaMilk[i]);
                    c.put("BACON_FRIED_BANANA", baconfriedBanana[i]);
                    c.put("AMAZING_BANANA", amazingBanana[i]);
                    c.put("CHOCOLATE_BANANA", chocolateBanana[i]);
                    c.put("CAKE_MIX_BANANA", cakeMixBanana[i]);

                    c.put("BestGrilledHamburger",BestGrilledHamburger[i]);
                   c.put("MeltedWitch", MeltedWitch[i]);
                    c.put("MorningSunshine", MorningSunshine[i]);
                    c.put("HomemadeStewedTomatoes",HomemadeStewedTomatoes[i]);
                    c.put("RotelTomatoes", RotelTomatoes[i]);
                    c.put("FriedBacon", FriedBacon[i]);
                    c.put("Breadcrumbs", Breadcrumbs[i]);
                    c.put("SoftBreadCrumbs", SoftBreadCrumbs[i]);
                    c.put("Applesauce", Applesauce[i]);
                    c.put("SoftAppleSlices", SoftAppleSlices[i]);
                    c.put("Cappuccino", Cappuccino[i]);
                    c.put("CafeLatte", CafeLatte[i]);
                    c.put("BakedPotato", BakedPotato[i]);
                    c.put("ScreamingPotatoes", ScreamingPotatoes[i]);
                    c.put("AppleCarrotJuice", AppleCarrotJuice[i]);
                   c.put("WholeWheatChapatis", WholeWheatChapatis[i]);
                   c.put("HomemadeSeitan", HomemadeSeitan[i]);
                   c.put("HomemadeNoodles",HomemadeNoodles[i]);
                    c.put("Rivilchas",Rivilchas[i]);
                    c.put("BasicPasta",BasicPasta[i]);
                    c.put("BakedEggsinBaconWraps",BakedEggsinBaconWraps[i]);
                    c.put("BaconFiletMignon", BaconFiletMignon[i]);
                    c.put("CreamyCandyBarSauce",CreamyCandyBarSauce[i]);
                    c.put("LowFatChipDip",LowFatChipDip[i]);
                    c.put("CreamBiscuits",CreamBiscuits[i]);
                    c.put("BananaMilkshake",BananaMilkshake[i]);
                    c.put("CremeFraiche", CremeFraiche[i]);
                    c.put("RoastPorkLoinChop",RoastPorkLoinChop[i]);
                    c.put("FriedMashedPotatoes",FriedMashedPotatoes[i]);
                    c.put("CaramelizedOnions", CaramelizedOnions[i]);
                    c.put("PurestPeaPuree",PurestPeaPuree[i]);
                    c.put("TomatoVegetableMeatlessMeatballSoup",TomatoVegetableMeatlessMeatballSoup[i]);
                   c.put("PeasandCarrotRibbons", PeasandCarrotRibbons[i]);
                    c.put("VinaigretteOnions",VinaigretteOnions[i]);
                    c.put("DeepFriedPickles", DeepFriedPickles[i]);
                    c.put("PeanutbutterandPicklesandwich",PeanutbutterandPicklesandwich[i]);
                    c.put("CreamCheeseWrappedDillPickles",CreamCheeseWrappedDillPickles[i]);
                    c.put("EasiestSouffleEver",EasiestSouffleEver[i]);
                    c.put("CreamyCaramelAppleDip",CreamyCaramelAppleDip[i]);
                    c.put("BaconOlivePartySandwiches",BaconOlivePartySandwiches[i]);
                    c.put("BrownedButteredEggNoodles",BrownedButteredEggNoodles[i]);
                    c.put("ButterNoodles",ButterNoodles[i]);
                    c.put("ArmenianRiceandNoodles",ArmenianRiceandNoodles[i]);
                    c.put("SpinachandSweetPotatoes",SpinachandSweetPotatoes[i]);
                    c.put("UniqueSpinachNoodles",UniqueSpinachNoodles[i]);
                    c.put("StuffedPeaPods",StuffedPeaPods[i]);
                    c.put("DeepFriedSpinach",DeepFriedSpinach[i]);
                    c.put("BaconandSpinachDip",BaconandSpinachDip[i]);
                    c.put("SugarPeanuts",SugarPeanuts[i]);
                    c.put("HomemadePeanutButter",HomemadePeanutButter[i]);
                    c.put("BoiledPeanuts",BoiledPeanuts[i]);
                    c.put("VegetableRiceMedley",VegetableRiceMedley[i]);
                    c.put("RootVegetableSmash",RootVegetableSmash[i]);
                    c.put("HoboStew",HoboStew[i]);
                    long id= db.insert("INGREDIENT", null, c);




                }



               for(int j=0;j<61;j++)
               {
                    OpenHelper oP=new OpenHelper(con);
                   SQLiteDatabase dB=oP.getWritableDatabase();
                   ContentValues c = new ContentValues();
                   c.put("DISH_NAME",dishName[j]);
                   c.put("IMG_SRC",imgSource[j]);
                   c.put("DISH_LINK",link[j]);
                   long id= dB.insert("DISH", null, c);



               }

            }

        }
