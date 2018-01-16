package in.jatindhankhar.places.ui.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.jatindhankhar.places.R;
import in.jatindhankhar.places.ui.fragments.adapters.PlacesDataAdapter;

// Thanks https://guides.codepath.com/android/google-play-style-tabs-using-tablayout
public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    public static final String ARG_CATEGORY = "ARG_CATEGORY";

    private Context mContext;
    private RecyclerView recyclerView;
    private String mCategory;

    public static PageFragment newInstance(String category) {
        Bundle args = new Bundle();
        args.putString(ARG_CATEGORY,category);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCategory = getArguments().getString(ARG_CATEGORY);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        recyclerView = (RecyclerView) view;
        Log.d("RECYCLERVIEW","Category name is  " + mCategory );
        setRecyclerView();
        return view;
    }

    private void setRecyclerView()
    {
        recyclerView.setAdapter(new PlacesDataAdapter(getContext(),mCategory));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}