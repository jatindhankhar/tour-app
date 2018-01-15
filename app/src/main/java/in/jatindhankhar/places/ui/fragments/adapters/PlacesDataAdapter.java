package in.jatindhankhar.places.ui.fragments.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.jatindhankhar.places.R;

/**
 * Created by jatin on 1/14/18.
 */

public class PlacesDataAdapter extends RecyclerView.Adapter<PlacesDataAdapter.ViewHolder> {
    private String mCategory;
    public PlacesDataAdapter(String category) {
        this.mCategory = category;
    }

    @Override
    public PlacesDataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_card,parent,false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(PlacesDataAdapter.ViewHolder holder, int position) {
                holder.placeLocation.setText("Haifa Street");
                holder.placeName.setText(mCategory);
                holder.placeRating.setRating(4.5f);
                holder.placePicture.setImageResource(R.drawable.india_gate);
    }

    @Override
    public int getItemCount() {
        return 3;
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
            ButterKnife.bind(this,itemView);
        }
    }
}
