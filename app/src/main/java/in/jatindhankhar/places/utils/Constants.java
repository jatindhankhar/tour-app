package in.jatindhankhar.places.utils;

import in.jatindhankhar.places.R;

/**
 * Created by jatin on 1/15/18.
 */

public class Constants {

    public static int tabColors[] = new int[]{R.color.colorPrimary, R.color.blue, R.color.green, R.color.yellow};
    public static int[] tabIcons = {
            R.drawable.explore,
            R.drawable.eat,
            R.drawable.shop,
            R.drawable.hotel
    };

    public static String[] explore_places_name = {"India Gate","Lotus Temple","Qutub Minar","AksharDham Temple"};
    public static String[] explore_places_location = {"Rajpath Marg, India Gate, New Delhi, Delhi 110001","Lotus Temple Rd, Bahapur, Shambhu Dayal Bagh, Kalkaji, New Delhi, Delhi 110019"
                                                        ,"Mehrauli, Seth Sarai, Mehrauli, New Delhi, Delhi 110030"
                                                        ,"Noida Mor, Pandav Nagar, New Delhi, Delhi 110092"};
    public static String[] explore_places_phone_number = {"011 2336 5358","011 2644 4029","011 2469 8431","011 4344 2344"};
    public static int[] explore_places_images = {R.drawable.india_gate,R.drawable.lotus_temple,R.drawable.qutub_minar,R.drawable.akshardham_temple};

    
    private Constants() {

    }
}
