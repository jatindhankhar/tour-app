package in.jatindhankhar.places.ui.fragments.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.jatindhankhar.places.R;
import in.jatindhankhar.places.model.Place;

import static in.jatindhankhar.places.utils.Constants.MAP_KEY_IMAGES;
import static in.jatindhankhar.places.utils.Constants.MAP_KEY_LOCATION;
import static in.jatindhankhar.places.utils.Constants.MAP_KEY_NAME;
import static in.jatindhankhar.places.utils.Constants.PLACE_COUNT;
import static in.jatindhankhar.places.utils.Utils.getEatMap;
import static in.jatindhankhar.places.utils.Utils.getExploreMap;
import static in.jatindhankhar.places.utils.Utils.getShopMap;
import static in.jatindhankhar.places.utils.Utils.getStayMap;


/**
 * Created by jatin on 1/14/18.
 */

public class PlacesDataAdapter extends RecyclerView.Adapter<PlacesDataAdapter.ViewHolder> {
    private String mCategory;
    private Context mContext;
    private HashMap<String, ArrayList<Place>> placeData = new HashMap<>();

    public PlacesDataAdapter(Context context, String category) {
        this.mCategory = category;
        this.mContext = context;
        Log.d("BOI", "Fetching for category " + category);

        populatedata();

    }

    @Override
    public PlacesDataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_card, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(PlacesDataAdapter.ViewHolder holder, int position) {
        Place p = placeData.get(mCategory).get(position);
        holder.placeLocation.setText(p.getLocation());
        holder.placeName.setText(p.getName());
        holder.placeRating.setRating(4.5f);
        holder.placePicture.setImageResource(p.getImageResource());
    }

    private void populatedata() {
        for (String category : mContext.getResources().getStringArray(R.array.tab_data)) {
            category = category.toLowerCase();
            placeData.put(category, fetchData(category));
        }

    }

    private ArrayList<Place> fetchData(String category) {
        ArrayList<Place> places = new ArrayList<>();
        HashMap<String, Object> placeMap = new HashMap<>();
        switch (category) {
            case "explore":
                placeMap = getExploreMap(mContext);
                break;
            case "eat":
                placeMap = getEatMap(mContext);
                break;
            case "shop":
                placeMap = getShopMap(mContext);
                break;
            case "stay":
                placeMap = getStayMap(mContext);

        }
        for (int i = 0; i < PLACE_COUNT; i++) {
            Place p = new Place();

            p.setName(((String[]) placeMap.get(MAP_KEY_NAME))[i]);
            p.setLocation(((String[]) placeMap.get(MAP_KEY_LOCATION))[i]);
            p.setImageResource(((int[]) placeMap.get(MAP_KEY_IMAGES))[i]);
            places.add(p);

        }

        return places;
    }

    @Override
    public int getItemCount() {
        return PLACE_COUNT;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.place_location)
        TextView placeLocation;
        @BindView(R.id.place_name)
        TextView placeName;
        @BindView(R.id.place_picture)
        ImageView placePicture;
        @BindView(R.id.place_rating)
        RatingBar placeRating;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
