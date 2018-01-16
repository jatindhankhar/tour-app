package in.jatindhankhar.places.utils;

import android.content.res.Resources;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import in.jatindhankhar.places.R;

/**
 * Created by jatin on 1/15/18.
 */

public class Constants {

    public static String MAP_KEY_NAME="names";
    public static String MAP_KEY_LOCATION = "locations";
    public static String MAP_KEY_PHONE = "numbers";
    public static String MAP_KEY_IMAGES = "images";
    public static int PLACE_COUNT = 4;
    public static int tabColors[] = new int[]{R.color.colorPrimary, R.color.blue, R.color.green, R.color.yellow};

    public static int[] tabIcons = {
            R.drawable.explore,
            R.drawable.eat,
            R.drawable.shop,
            R.drawable.hotel
    };


    public static HashMap<String, Object> getExploreMap() {
        HashMap<String,Object> map = new HashMap<>();
        map.put(MAP_KEY_NAME,explore_places_name);
        map.put(MAP_KEY_LOCATION,explore_places_location);
        map.put(MAP_KEY_PHONE,explore_places_phone_number);
        map.put(MAP_KEY_IMAGES,explore_places_images);
        return map;

    }

    public static HashMap<String,Object> getEatMap()
    {
        HashMap<String,Object> map = new HashMap<>();
        map.put(MAP_KEY_NAME,eat_places_name);
        map.put(MAP_KEY_LOCATION,eat_places_location);
        map.put(MAP_KEY_IMAGES,eat_places_images);
        return map;
    }

    public static HashMap<String,Object> getShopMap()
    {
        HashMap<String,Object> map = new HashMap<>();
        map.put(MAP_KEY_NAME,shop_places_name);
        map.put(MAP_KEY_LOCATION,shop_places_location);
        map.put(MAP_KEY_IMAGES,shop_places_images);
        return map;
    }

    public static HashMap<String,Object> getStayMap()
    {
        HashMap<String,Object> map = new HashMap<>();
        map.put(MAP_KEY_NAME,stay_places_name);
        map.put(MAP_KEY_LOCATION,stay_places_location);
        map.put(MAP_KEY_IMAGES,stay_places_images);
        return map;
    }

    /** Explore Data **/

    private static String[] explore_places_name = {"India Gate","Lotus Temple","Qutub Minar","AksharDham Temple"};
    private static String[] explore_places_location = {"Rajpath Marg, India Gate, New Delhi, Delhi 110001","Lotus Temple Rd, Bahapur, Shambhu Dayal Bagh, Kalkaji, New Delhi, Delhi 110019"
                                                        ,"Mehrauli, Seth Sarai, Mehrauli, New Delhi, Delhi 110030"
                                                        ,"Noida Mor, Pandav Nagar, New Delhi, Delhi 110092"};
    private static String[] explore_places_phone_number = {"011 2336 5358","011 2644 4029","011 2469 8431","011 4344 2344"};
    private static int[] explore_places_images = {R.drawable.india_gate,R.drawable.lotus_temple,R.drawable.qutub_minar,R.drawable.akshardham_temple};

    /** Eat Data **/
    private static String[] eat_places_name = {"Paranthe Wali Gali","Roshan Di Kulfi","Kallan Sweets","Raju Chaat Bhandar"};
    private static String[] eat_places_location = {"Paranthe Wali Gali, Maliwara, Chandni Chowk, New Delhi, Delhi","2816, Ajmal Khan Rd, Block 34P, Beadonpura, Karol Bagh, New Delhi, Delhi 110005"
                                                ,"Shop No.4-5,, Matia Mahal Road,Opposte Jama Masjid Gate No.1, Matia Mahal,, New Delhi, Delhi 110006"
                                                ,"76, Swami Narayan Marg, Ashok Vihar, Delhi, 110052"};
    private static int[] eat_places_images = {R.drawable.paranthe,R.drawable.kulfi,R.drawable.sweets,R.drawable.chaat};


    /** Shop Data **/

    private static String[] shop_places_name = {"Connaught Place","Janpath Market","Sarojini Nagar Market","Dilli Haat"};
    private static String[] shop_places_location = {"Connaught Place,New Delhi, Delhi 110001","Janpath Rd, Janpath, Connaught Place, New Delhi, Delhi 110001"
                                                    ,"Sarojini Nagar Market, Sarojini Nagar, New Delhi, Delhi",
                                                    "Kidwai Nagar West, Kidwai Nagar New Delhi, Delhi 110023"};
    private static int[] shop_places_images = {R.drawable.cp,R.drawable.janpath,R.drawable.sn,R.drawable.dilli_haat};

    /** Stay Data **/

    private static String[] stay_places_name = {"Paharganj","Saket","Connaught Place","South Delhi"};
    private static String[] stay_places_location = {"Paharganj, New Delhi, Delhi","Saket, New Delhi, Delhi 110017"
                                                ,"Connaught Place,New Delhi, Delhi 110001","South Delhi, New Delhi, Delhi"
                                                };

    private static int[] stay_places_images = {R.drawable.paharganj,R.drawable.saket,R.drawable.cp,R.drawable.south_delhi};

    public static String[] tabTitles = new String[] { "Explore", "Eat", "Shop","Stay" };


    private Constants() {

    }


}
