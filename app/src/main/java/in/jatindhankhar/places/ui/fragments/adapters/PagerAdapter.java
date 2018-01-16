package in.jatindhankhar.places.ui.fragments.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import in.jatindhankhar.places.R;
import in.jatindhankhar.places.ui.fragments.PageFragment;
import in.jatindhankhar.places.utils.Constants;

/**
 * Created by jatin on 1/13/18.
 */

// Thanks https://guides.codepath.com/android/google-play-style-tabs-using-tablayout
public class PagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public PagerAdapter(FragmentManager fm, Context ctx) {
        super(fm);
        this.mContext = ctx;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(mContext.getResources().getStringArray(R.array.tab_data)[position].toLowerCase());
    }

    @Override
    public int getCount() {
        return Constants.PLACE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getStringArray(R.array.tab_data)[position];
    }
}
